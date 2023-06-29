package de.telran;

public class MathematicalOperations {

    // Сложения двух чисел
    public static void main(String[] args) {
        int sum = (sumResult(32, 51));
        System.out.println("Sum of numbers: "+sum);

        // Вычитания двух чисел
        int difference = (differenceResult(32, 51));
        System.out.println("Difference of numbers: "+difference);

        // Умножения двух чисел
        int multiplication = (multiplicationResult(32, 51));
        System.out.println("Multiplication of numbers: "+multiplication);

        // Деления двух чисел
        int degree = (degreeResult(30, 15));
        System.out.println("Degree of numbers: "+degree);
    }

    // Сложения двух чисел
    static int sumResult(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }

    // Вычитания двух чисел
    static int differenceResult(int num1, int num2) {
        int difference = num1-num2;
        return difference;
    }

    // Умножения двух чисел
    static int multiplicationResult(int num1, int num2) {
        int multiplication = num1*num2;
        return multiplication;
    }

    // Деления двух чисел
    static int degreeResult(int num1, int num2) {
        int degree = num1/num2;
        return degree;
    }
}
