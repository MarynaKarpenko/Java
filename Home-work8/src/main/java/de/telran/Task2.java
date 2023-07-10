package de.telran;

// Реализуйте программу,
// которая попросит пользователя ввести год и
// напечатать этот год isLeap (високосный) или нет.

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        boolean isLeap = ((year > 1584) && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

        if (isLeap) {
            System.out.println("This year is a leap year!");
        } else {
            System.out.println("This year is not high!");
        }
    }
}
