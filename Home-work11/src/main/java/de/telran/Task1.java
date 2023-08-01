package de.telran;

import java.util.Arrays;
import java.util.Random;

// Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n.
// Найдите недостающий элемент.

// input:
// arr[] = {1,2,3,5}
// out: 4

// arr[] = {6,1,2,8,3,4,7,10,5}
// out: 9
public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int missingElement1 = findMissingElement(arr1);
        System.out.println("Missing element: " + missingElement1);

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int missingElement2 = findMissingElement(arr2);
        System.out.println("Missing element: " + missingElement2);
    }
    public class MissingElementFinder {

    }
        public static int findMissingElement(int[] arr) {
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }
            return arr.length + 1;
        }
    }
