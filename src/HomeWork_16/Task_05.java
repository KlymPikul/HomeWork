package HomeWork_16;

/*
Task 5

Реализуйте метод sumOfArray (сумма элементов массива),
который получает на вход массив и определяет сумму его элементов.
 */

public class Task_05 {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of the array is: " + sumOfArray(array));
    }

}
