package HomeWork_16;

/*
Task 1

Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
Метод должен поменять местами значения, хранящихся в этих индексах

{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
Если индексы за пределами массива?

Перегрузка метода для работы с массивами строк.
 */

public class Task_01 {

    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = {"zero", "one", "two", "three", "four", "five", "six"};

        // вызов метода swap для массива целых чисел
        swap(intArray, 1, 5);
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // вызов метода swap для массива строк
        swap(stringArray, 1, 5);
        for (String value : stringArray) {
            System.out.print(value + " ");
        }
    }

    // метод обмена элементов в массиве целых чисел
    public static void swap(int[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            System.out.println("Индексы за пределами массива");
        } else {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    // Перегрузка метода для работы с массивами строк
    public static void swap(String[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            System.out.println("Индексы за пределами массива");
        } else {
            String temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

}
