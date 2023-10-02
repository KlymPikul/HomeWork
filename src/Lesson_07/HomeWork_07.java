package Lesson_07;

//Task 0
//  Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
//1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3


    import java.util.Scanner;


public class HomeWork_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число 1, 2 или 3: ");

        number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели число один");
        } else if (number == 2) {
            System.out.println("Вы ввели число два");
        } else if (number == 3) {
            System.out.println("Вы ввели число три");
        }


    }

}
