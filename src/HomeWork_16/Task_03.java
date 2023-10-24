package HomeWork_16;

/*
Task 3

Написать метод по поиску строки в массиве строк.
На вход метод принимает массив строк, и строку для поиска.
 */
public class Task_03 {
    public static int searchStringInArray(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Если строка найдена, возвращаем индекс элемента
            }
        }
        return -1; // Если строка не найдена, возвращаем -1
    }

    public static void main(String[] args) {
        String[] stringArray = { "Mazda", "BMW", "Opel", "Mercedes", "Porsche" };
        String targetString = "Opel";

        int result = searchStringInArray(stringArray, targetString);

        if (result != -1) {
            System.out.println("Строка '" + targetString + "' найдена в массиве, ее индекс: " + result);
        } else {
            System.out.println("Строка '" + targetString + "' не найдена в массиве.");
        }
    }
}
