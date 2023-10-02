package Lesson_18;


public class RuberrArray {
    int[] array; // = new int[10];
    int cursor;


    public RuberrArray() {
        array = new int[4];
    }

    void add(int number) {
        array[cursor++] = number;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? "," : "}");
        }
        return result;
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