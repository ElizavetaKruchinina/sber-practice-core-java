package ru.sber.base.syntax.task7;

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        double d, x1, x2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a = ");
        double a = scan.nextDouble();
        System.out.print("Введите b = ");
        double b = scan.nextDouble();
        System.out.print("Введите c = ");
        double c = scan.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + "x2 = " + x2);
        }
        else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println("x =" + x1);
        }
        else {
            System.out.println("Нет корней");
        }
    }
}

