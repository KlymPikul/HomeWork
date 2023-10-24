package HomeWork_15;

public class Task_01 {


    // Метод для проверки, является ли число простым (Task 0)
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод для подсчета простых чисел в массиве (Task 1)
    public static int countPrimesInArray(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int primeCount = countPrimesInArray(numbers);
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }
}
