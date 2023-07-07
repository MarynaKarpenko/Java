package de.telran;

import java.util.Scanner;

public class Task2Option2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько секунд осталось ");
        int sec = sc.nextInt();
        if (sec > 0 && sec < 28_800) {
            double min = sec / 60;
            int hours = (int) min / 60;
            int hoursMin = (int) min % 60;
            double MinSec = sec - ((hours * 60 * 60) + (hoursMin * 60));
            int hoursMinSec = (int) MinSec;
            System.out.println("Осталось работать: " + sec + " секунд");
            System.out.println("Осталось работать: " + hours + " часа " + hoursMin + " минут " + hoursMinSec + " секунд");
        } else {
            System.out.println("Введено неправильное значение, нужно проверить зрение " +
                    "\nили ты переработался");
        }
    }
}

