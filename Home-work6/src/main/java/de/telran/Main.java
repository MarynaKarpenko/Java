package de.telran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // считывание об с команд строки

        System.out.println("Enter the first word: ");
        String word1 = scanner.nextLine();        // переменная равна тому, что считаем с консоли

        System.out.println("Enter the second word: ");
        String word2 = scanner.nextLine();

        if (word1.length() % 2 != 0) {
            System.err.println("Первое введенное слово не четное");
        } else if (word2.length() % 2 != 0) {
            System.err.println("Второе введенное слово не четное");
        } else {
            System.out.println(cutTwoWordsInHalAndMerge(word1, word2));
        }
    }
    public static String cutTwoWordsInHalAndMerge(String firstWord, String secondWord) {
        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() / 2);

        return firstHalf + secondHalf;
    }
}
