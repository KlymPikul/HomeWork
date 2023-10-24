package HomeWork_16;

/*
Task 4

Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа
входящей строки, переведенных в верхний регистр. Распечатать полученный результат в методе main

"Hello" -> "EL"
"He" -> "E"
"H" -> ???
 */

public class Task_04 {
    public static void main(String[] args) {
        // Примеры входных строк
        String input1 = "Hello";
        String input2 = "He";
        String input3 = "H";

        // Вызываем метод и выводим результат
        System.out.println(getUpperChars(input1)); // Выведет "EL"
        System.out.println(getUpperChars(input2)); // Выведет "E"
        System.out.println(getUpperChars(input3)); // Выведет пустую строку, так как нет 2го и 3го символа
    }

    // Метод для получения 2го и 3го символа в верхнем регистре
    public static String getUpperChars(String input) {
        if (input.length() >= 3) {
            char char2 = Character.toUpperCase(input.charAt(1));
            char char3 = Character.toUpperCase(input.charAt(2));
            return String.valueOf(char2) + String.valueOf(char3);
        } else {
            return ""; // Возвращаем пустую строку, если длина входной строки меньше 3
        }
    }
}
