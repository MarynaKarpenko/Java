package de.telran;

// Создайте массив из 8 случайных целых чисел из интервала [1;50]
// Выведите массив на консоль в строку.
// Замените каждый элемент с нечетным индексом на ноль.
// Снова выведете массив на консоль в отдельной строке.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arrInt = new int[8];
        Random random = new Random();

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(50)+1;
        }
        System.out.print("Arr: " + Arrays.toString(arrInt));

        for (int i = 0; i < arrInt.length; i+=2) {
            arrInt[i] = 0;
        }
        System.out.print("\nNew arr: " + Arrays.toString(arrInt));
    }
}
