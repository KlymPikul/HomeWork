package lesson_22;

public class ArraysUtil {
    public static int LinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static void sortArray(int[] array) {
        int minIndex = searchMin(array);

        int temp = array[0];
        array[0] = array[minIndex];
        array[minIndex] = temp;

    }

    private static int searchMin(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}


