package de.telran;

public class Task1 {
    public static void main(String[] args) {
        // 1. Создайте строку через new - I study Basic Java!
        String myStr = new String("I study Basic Java!");

        // 2. Напишите метод, который принимает в качестве параметра строку,
        // передайте в этот метод строку, которую создали в п.1
        System.out.println(myStr);

        // 3. Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(myStr.charAt(myStr.length()-2));

        // 4. Проверить, содержит ли ваша строка подстроку “Java”.
        // Используем метод String.contains().
        boolean containsJava = myStr.contains("Java");
        System.out.println("Строка содержит подстроку \"Java\": "+containsJava);

        // 5. Вырезать строку Java c помощью метода String.substring().
        String javaSubstring  = myStr.substring(14, 18);
        String modifiedStr = myStr.replace(javaSubstring,"");
        System.out.println(modifiedStr);

        // 6. Заменить все символы “а” на “о”.
        String replacedStr = myStr.replace('a', 'o');
        System.out.println("Новая строка: "+replacedStr);

        // 7. Преобразуйте строку к верхнему регистру.
        String upperCaseStr = myStr.toUpperCase();
        System.out.println("Строка в верхнем регистре: "+upperCaseStr);

        // 8. Преобразуйте строку к нижнему регистру.
        String lowerCaseStr = myStr.toLowerCase();
        System.out.println("Строка в нижнем регистре: "+lowerCaseStr);
    }
}
