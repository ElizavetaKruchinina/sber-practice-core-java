package ru.sber.base.syntax.task3;

public class Snow {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 20; j++) {
                if ((i + j)% 2 == 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}
