package de.telran;

// Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
// Реализует логический метод canBuy,  возвращающий boolean
// Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
// Отобразите строку «Я могу купить еду, это ……» и значение.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int isEdekaOpeningHour = 9;
        int isEdekaClosingHour = 20;
        int isReweOpeningHour = 8;
        int isReweClosingHour = 22;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current time: ");
        int currentTime = scanner.nextInt();

        boolean isEdekaOpen = isShopOpen (isEdekaOpeningHour, isEdekaClosingHour, currentTime);
        boolean isReweOpen = isShopOpen (isReweOpeningHour, isReweClosingHour, currentTime);

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("I can buy food, it is " + canBuy);


        if ((isEdekaOpeningHour<=currentTime && isEdekaClosingHour>=currentTime) &&
                (isReweOpeningHour<=currentTime && isReweClosingHour>=currentTime)) {
            System.out.println("Edeka and Rewe are open");
        } else if (!(isEdekaOpeningHour<=currentTime && isEdekaClosingHour>=currentTime) &&
                !(isReweOpeningHour<=currentTime && isReweClosingHour>=currentTime)) {
            System.out.println("Edeka and Rewe are close");
        } else if (!(isEdekaOpeningHour<=currentTime && isEdekaClosingHour>=currentTime) &&
                (isReweOpeningHour<=currentTime && isReweClosingHour>=currentTime)) {
            System.out.println("Edeka is closed, Rewe is open");
        } else if ((isEdekaOpeningHour<=currentTime && isEdekaClosingHour>=currentTime) &&
                !(isReweOpeningHour<=currentTime && isReweClosingHour>=currentTime)) {
            System.out.println("Edeka is open, Rewe is closed");
        }

    }
    public static boolean isShopOpen(int openingHour, int closingHour, int currentTime) {
        return currentTime >= openingHour && currentTime <= closingHour;
    }
    public static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
