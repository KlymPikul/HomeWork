package HomeWork_13;

/*
Task 3 опционально

Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7
Вывод : 256

Можно такой вывод:

72, 86, 100, 112, 113, 119, 256
Искомое число: 256
Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -

[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
7-й элемент (по счету) этого массива хранит значение 256.
 */
public class Task_04 {
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKthElement(array1, array2, k);
        System.out.println("Искомое число: " + result);
    }

    public static int findKthElement(int[] array1, int[] array2, int k) {
        int index1 = 0, index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                if (index1 + index2 == k - 1) {
                    return array1[index1];
                }
                index1++;
            } else {
                if (index1 + index2 == k - 1) {
                    return array2[index2];
                }
                index2++;
            }
        }

        while (index1 < array1.length) {
            if (index1 + index2 == k - 1) {
                return array1[index1];
            }
            index1++;
        }

        while (index2 < array2.length) {
            if (index1 + index2 == k - 1) {
                return array2[index2];
            }
            index2++;
        }

        return -1; // Если k выходит за пределы длин массивов
    }
}
