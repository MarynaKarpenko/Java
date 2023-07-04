package de.telran;

// Создать программу, выводящую на экран ближайшее к 10
// из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.

public class Task1 {
    public static void main(String[] args) {
        double m=10.5, n=10.45;

        if((m-10)>(n-10)) {
            System.out.println("Число "+n+" ближе к 10");
        }
        else if ((m-10)<(n-10)) {
            System.out.println("Число "+m+" ближе к 10");
        }
        else {
            System.out.println("Числа равноудалены от 10");
        }
    }
}
