package ru.sber.base.syntax.task2;

import java.util.Scanner;

public class Numbers {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int num = scan.nextInt();

        if ((num > 500) | (num <1)) {
            System.out.println("Введено недопустимое число " + num + ". Допустимый диапазон значений: 1 - 500");
        }
        else {
            int j = 0;
            for (int i = 7; j < num; i += 7) {
                System.out.print(i + " ");
                j += 1;
            }
        }
    }
}