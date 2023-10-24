package Lesson_18;

import java.util.Arrays;
import java.util.Random;

public class RubberArray {
    int[] array; // = new int[10];
    int cursor;
    Random random = new Random();


    public RubberArray() {
        array = new int[10];
    }

    //void add(int number) {
      //  array[cursor++] = number;
    //}

    public RubberArray(int sizeDefault) {
        array = new int[sizeDefault];
    }

    void add(int number) {
        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor++] = number;
    }


    void add(int... ints) {
        /* могу обращаться как с массивом (перебирать по индексам)
        for (int i = 0; i < ints.length; i++) {
            ints[i]
        }
         */
        ints[0] = 100;

        for (int value : ints) {
            add(value);
        }
    }

    void addRandomValues(int count, int bound) {
        for (int i = 0; i < count; i++) {
            add(random.nextInt(bound));
        }
    }

    void addRandomValues(int count) {
        addRandomValues(count, 101);
    }


    void expandArray() {
//        int[] newArray = Arrays.copyOf(array, array.length * 2);
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? "," : "}");
        }
        return result;
    }

    int length() {
        return cursor;
    }

    int indexOf(int number) {
        // 1. Перебрать массив, сравнить элементы, вернуть индекс
        // Если совпадений нет - вернуть минус 1.

        for (int i = 0; i < cursor; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    int lastIndexOf(int number) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    boolean contains(int value) {
        return indexOf(value) >= 0; //переиспользуем уже написанный код (метод)
    }

    boolean remove(int value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    int[] toArray() {
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    void trim() {
        System.out.println("Текущий array1: " + Arrays.toString(array));
        array = toArray();
        System.out.println("Текущий array2: " + Arrays.toString(array));
    }

    int removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) return Integer.MIN_VALUE;
        int value = array[index];

        int[] result = new int[array.length - 1];

        /* // Option1
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, cursor - 1- index);
        System.out.println(Arrays.toString(result));
         */

        //Option2
        for (int i = 0; i < cursor; i++) {
            if (i < index) {
                result[i] = array[i];
            } else { // i >= index
                result[i] = array[i + 1];
            }
        }

        cursor--;
        array = result;

        return value;
    }
}


/*
1. Динамическое изменение размера массива
2. Добавление элементов\ значений в массив
3. Поиск значения в массиве
4. Удаление элемента по значению и по индексу из массива
5. Найти мин, макс, среднее, сумму элементов
7. Количество элементов в массиве
8. Строковое представление массива (для вывода в консоль)
9. Добавлять несколько значений
 */

/*
    public static void main(String[] args) {

        int[] ints = new int[1000];
        int[] ints1 = {1, 2, 3, 4, 5};
        int number = 100;

        for (int i = 0; i < ints.length; i++) {

        }

    }

     */