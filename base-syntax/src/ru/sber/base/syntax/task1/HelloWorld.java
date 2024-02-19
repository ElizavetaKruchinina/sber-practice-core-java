package ru.sber.base.syntax.task1;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String [] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");

    }
}