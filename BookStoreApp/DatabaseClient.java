package com.yourpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class DatabaseClient {
    private Connection connection;

    public static void main(String[] args) {
        DatabaseClient client = new DatabaseClient();
        client.run();
    }

    public void run() {
        try {
            connectToDatabase();
            System.out.println("Подключение установлено, введите SQL выражение");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String sql = scanner.nextLine();
                if (sql.equalsIgnoreCase("QUIT")) {
                    break;
                }
                executeSQL(sql);
            }
        } catch (SQLException | IOException e) {
            System.err.println("Ошибка подключения к БД: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    private void connectToDatabase() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/config.properties"));

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String password = properties.getProperty("db.password");

        connection = DriverManager.getConnection(url, user, password);
    }

    private void executeSQL(String sql) {
        try {
            Statement statement = connection.createStatement();
            if (sql.toUpperCase().startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery(sql);
                displayResultSet(resultSet);
            } else {
                int result = statement.executeUpdate(sql);
                System.out.println("Команда выполнена успешно. Затронуто строк: " + result);
            }
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения SQL: " + e.getMessage());
        }
    }

    private void displayResultSet(ResultSet resultSet) throws SQLException {
        int rowCount = 0;
        boolean hasMoreRows = false;

        while (resultSet.next()) {
            if (rowCount < 10) {
                System.out.println("Запись " + (rowCount + 1) + ": " + resultSet.getString(1));
                rowCount++;
            } else {
                hasMoreRows = true;
                break;
            }
        }
        if (hasMoreRows) {
            System.out.println("В БД есть еще записи.");
        }
    }

    private void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {

            System.err.println("Ошибка закрытия подключения: " + e.getMessage());
        }
    }
}
