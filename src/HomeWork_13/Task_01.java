package HomeWork_13;

/* Task 0

Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке

 */

import java.util.Arrays;
public class Task_01 {


    public static void printReversed(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReversed(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return;
        }

        // Печатаем часть массива слева до индекса в обычном порядке
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }

        // Печатаем оставшуюся часть массива в обратном порядке
        for (int i = arr.length - 1; i > index; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printReversed(int[] arr, boolean reverse) {
        if (reverse) {
            // Печатаем массив в обратном порядке
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            // Печатаем массив в прямом порядке
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7};
        int index = 2;
        boolean reverse = false;

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.print("Print Reversed: ");
        printReversed(arr);

        System.out.print("Print Reversed with Index " + index + ": ");
        printReversed(arr, index);

        System.out.print("Print Reversed with Reverse Flag " + reverse + ": ");
        printReversed(arr, reverse);
    }
}
