package ru.sber.base.syntax.task4;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int num = scan.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Нет");
                return;
            }
        }
        System.out.println("Да");
    }
}