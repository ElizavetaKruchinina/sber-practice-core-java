package ru.sber.base.syntax.task6;
import java.lang.Math;
public class RandomNumbers {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1001);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");
        int max = arr[0];
        int maxIndex = 0;
        double avg = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            avg += (double) arr[i] / arr.length;
        }
        System.out.println("Максимальное значение = " + max + " находится в элементе под индексом " + maxIndex);
        System.out.println("Среднее значение = " + avg);
    }
}
