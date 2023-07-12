package de.telran;

// Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство.
// Ваша программа должна иметь переменные temperature1 и temperature2.
// В результате метод возвращает true или false.

public class Task1 {
    public static void main(String[] args) {
        int temperature1 = 120;
        int temperature2 = 80;
        boolean isFlaskWorking = checkFlask(temperature1, temperature2);
        System.out.println(" Is device working correctly? " + isFlaskWorking);
    }
    public static boolean checkFlask(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}
