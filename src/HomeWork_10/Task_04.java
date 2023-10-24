package HomeWork_10;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите произвольное число: ");
        int number = scanner.nextInt();

        int sum = 0;

        do {
            int digit = number % 10; // Получаем последнюю цифру числа
            sum += digit; // Добавляем цифру к сумме
            number /= 10; // Убираем последнюю цифру из числа
        } while (number > 0);

        System.out.println("Сумма цифр числа: " + sum);
    }
}
