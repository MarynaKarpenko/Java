package de.telran;

public class Task1Option2 {
    public static void main(String[] args) {
        int firstNumber = 14;
        int secondNumber = -20;
        System.out.println(Math.abs(firstNumber));
        System.out.println(Math.abs(secondNumber));

        double n = 8.5;
        double m = 11.45;
        int a = 10;
        double b = Math.abs(a - n);
        double c = Math.abs(a - m);
        if (b == c) {
            System.out.println("Числа "+n+" и "+m+" равноудаленны от "+a);
        } if (b>c) {
            System.out.println("Число "+m+" ближе к "+a);
        } if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }
    }
}
