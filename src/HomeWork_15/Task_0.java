package HomeWork_15;

/*
Task 0

Написать метод принимающий целое число и проверяющий является ли число простым.
Если является, метод должен вернуть true, не является - false
 */

 import java.util.Scanner;
public class Task_0 {
    public static void main(String[] args) {
        int number = 7; // Замените это число на любое другое, которое вы хотите проверить на простоту
        boolean isPrime = isPrimeNumber(number);

        //  Если хотите ввести число через консоль

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrimeNumber(number);
*/

        if (isPrime) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми
        }

        if (number <= 3) {
            return true; // 2 и 3 - простые числа
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Если число делится на 2 или 3 без остатка, то оно не простое
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Если число делится на (i) или (i + 2) без остатка, то оно не простое
            }
        }

        return true; // Если число не делится на все вышеперечисленные, то оно простое
    }
}
