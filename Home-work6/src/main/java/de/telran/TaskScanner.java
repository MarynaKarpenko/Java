package de.telran;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {
        //Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
        // (проверьте количество букв в слове).
        //Нужно получить слово, состоящее из первой половины первого слова
        // и второй половины второго слова. распечатать на консоль.
        //Например:
        //ввод - mama, papa
        //вывод - mapa

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second word: ");
        String word2 = scanner.nextLine();

        int wordLength1 = word1.length();
        boolean isLength1 = word1.length()%2==0;
        System.out.println("Word-1 length contains an even number of letters: "+isLength1);

        int wordLength2 = word2.length();
        boolean isLength2 = word2.length()%2==0;
        System.out.println("Word-2 length contains an even number of letters: "+isLength2);

        String cutString1 = word1.substring(0,2);
        String cutString2 = word2.substring(2,4);

        System.out.println(cutString1+cutString2);
    }
}
