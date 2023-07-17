package de.telran;

// Создайте массив из 5 случайных целых чисел из интервала [10;99]
// Выведите его на консоль в строку.
// Определите и выведите на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        Random random = new Random();

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(90)+10;
        }
        System.out.println("Arr: " + Arrays.toString(arrInt));

        boolean isIncreasing = true;
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt [i] <= arrInt[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("The array is strictly increasing.");
        } else {
            System.out.println("The array is not strictly increasing.");
        }
    }
}
