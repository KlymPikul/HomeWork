package Lesson_07.HW_07;


import java.util.Random;
public class part02 {

        public static void main(String[] args) {
            // Создаем объект Random для генерации случайных чисел
            Random random = new Random();

            // Генерируем 4 случайных числа от 0 до 100
            int number1 = random.nextInt(101); // Генерируем число от 0 до 100
            int number2 = random.nextInt(101);
            int number3 = random.nextInt(101);
            int number4 = random.nextInt(101);

            // Выводим сгенерированные числа на экран
            System.out.println("Сгенерированные числа:");
            System.out.println("Число 1: " + number1);
            System.out.println("Число 2: " + number2);
            System.out.println("Число 3: " + number3);
            System.out.println("Число 4: " + number4);

            // Определяем максимальное число с помощью if
            int maxNumber = number1;

            if (number2 > maxNumber) {
                maxNumber = number2;
            }

            if (number3 > maxNumber) {
                maxNumber = number3;
            }

            if (number4 > maxNumber) {
                maxNumber = number4;
            }

            // Выводим максимальное число на экран
            System.out.println("Максимальное число: " + maxNumber);
        }
    }

