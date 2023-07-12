package de.telran;

import java.util.Scanner;

// У вас на банковском счету N долларов.
// Вы хотите снять все, но банк разрешает снять только сумму,
// которая является делителем текущей суммы на счету и меньше текущей суммы.
// Если вы снимаете максимально возможную сумму каждый день,
// сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
// Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
// Ввод:  N = 21
// Выход:  7
// Объяснение:  N = 21
// Снято 7, осталось = 14
// Снято 7, осталось = 7
// Снято 1, осталось = 6
// Снято 3, осталось = 3
// Снято 1, осталось = 2
// Снято 1, Осталось = 1
// Снято 1, осталось = 0
public class Task2 {
    public static void main(String[] args) {
        int N;
        int withdrawalSum = 0;
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum on the account : ");
        N = scanner.nextInt();

        while (N >= 0) {
            withdrawalSum = withdrawalAmount(N);
            N -= withdrawalSum;
            days++;
        }
        System.out.println("Number of days needed: " + days);
    }
    static int withdrawalAmount(int N) {
        for (int i = N / 2; i > 0; i--) {
            if (N % i == 0) ;
            System.out.println("Balance " + N + ", pull off " + i);
            return i;
        }
        return 1;
    }
}
