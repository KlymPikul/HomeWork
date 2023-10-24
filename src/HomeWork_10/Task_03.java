package HomeWork_10;

import java.util.Scanner;
public class Task_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctWord = "hello";
        int attempts = 0;

        while (true) {
            System.out.print("Введите слово 'hello': ");
            String userInput = scanner.next();
            attempts++;

            if (userInput.equalsIgnoreCase(correctWord)) {
                System.out.println("Спасибо! Вы ввели правильное слово.");
                break;
            } else {
                System.out.println("Вы ввели неверное слово. Попробуйте еще раз.");
            }
        }

        System.out.println("Количество попыток: " + attempts);
        scanner.close();
    }
}
