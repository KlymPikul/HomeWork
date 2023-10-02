package lesson_03;

//  Какие числа могут получаться в качестве остатка от деления какого-либо
//  целого числа на 2? На 3? Покажите это на конкретных примерах.

import java.util.Scanner;

public class hw_task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");

        int var = scanner.nextInt();

        System.out.println("Остаток от деления на 2: " + var % 2);
        System.out.println("Остаток от деления на 3: " + var % 3);

    }
}
