package hw_12;

import java.util.Random;
public class Task_02 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[50];
        int primeCount = 0;

        // Заполнение массива случайными числами от 1 до 100
        Random rand = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Сгенерированный массив случайных чисел:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nПростые числа в массиве:");

        for (int number : randomNumbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
        }

        System.out.println("\nВсего простых чисел: " + primeCount);
    }

    // Функция для проверки числа на простоту
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
