package hw_12;

//Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив,
// количество четных чисел в массиве и сумму всех четных чисел.

import java.util.Random;

public class task_01 {
    public static void main(String[] args) {

            // Создаем массив на 20 элементов
            int[] array = new int[20];

            // Заполняем массив случайными целыми числами
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                array[i] = random.nextInt(100); // Здесь 100 - максимальное случайное число, можно изменить по вашему усмотрению.
            }

            // Выводим массив на экран
            System.out.println("Массив случайных чисел:");
            for (int i = 0; i < 20; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(); // Перевод строки

            // Находим количество четных чисел и их сумму
            int evenCount = 0;
            int evenSum = 0;
            for (int i = 0; i < 20; i++) {
                if (array[i] % 2 == 0) {
                    evenCount++;
                    evenSum += array[i];
                }
            }

            // Выводим количество четных чисел и их сумму
            System.out.println("Количество четных чисел: " + evenCount);
            System.out.println("Сумма четных чисел: " + evenSum);
        }
            }







