package org.telran;

public class Task2 {
    public static void main(String[] args) {
        int myInt = 345;

        int number1 = myInt/100;
        int number2 = (myInt/10)%10;
        int number3 = myInt%10;

        System.out.println("Число "+myInt+" -> "+number1+", "+number2+", "+number3);
    }
}