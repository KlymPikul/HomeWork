package HomeWork_15;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task 4 опционально

Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел,
присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Task_03 {
    public static void main(String[] args) {
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] resultArray = findPrimeNumbers(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }

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

    public static int[] findPrimeNumbers(int[] inputArray) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int num : inputArray) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }

        int[] primeArray = new int[primeList.size()];
        for (int i = 0; i < primeList.size(); i++) {
            primeArray[i] = primeList.get(i);
        }

        return primeArray;
    }
}
