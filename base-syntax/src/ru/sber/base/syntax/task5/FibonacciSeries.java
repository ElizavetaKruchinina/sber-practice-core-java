package ru.sber.base.syntax.task5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;

        if ((n > 100) | (n < 2)) {
           System.out.println("Введено недопустимое значение количества чисел");
        }
        else {
            System.out.print(num1 + " " + num2 + " ");
            for(int i = 3; i <= n; i++){
                num3 = num1 + num2;
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }
        }
    }
}
