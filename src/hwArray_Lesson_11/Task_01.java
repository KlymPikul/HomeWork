package hwArray_Lesson_11;

/*Task 1 Дан массив целых чисел. Поменять местами элемент с максимальным
и минимальным значением

        Пример:

        { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}

 */
public class Task_01 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        // Найдем индексы элементов с максимальным и минимальным значениями в массиве.
        int maxIndex = 0;
        int minIndex = 0;
        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        // Поменяем местами элементы с максимальным и минимальным значениями.
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        // Выведем обновленный массив.
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
