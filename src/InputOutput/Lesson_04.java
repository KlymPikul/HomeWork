package InputOutput;


// Реализовать приложение, которое читает информацию о вас, и печатает итог на экран:
//Введите ваше имя:
//Klym
//Введите вашу фамилию:
//Pikul
//Введите ваш город:
//Erndtebruck
//Введите ваш возраст:
//34
//Введите ваш рост (в метрах):
//1.87

import java.util.Scanner;

public class Lesson_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите Вашу фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите Ваш город проживания: ");
        String city = scanner.nextLine();
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите Ваш рост: ");
        double height = scanner.nextDouble();

        String info = "Вас зовут " + (name + surname)  +   "Вы проживаете в городе  " + city  + "Ваш возраст " + age
                + "Ваш рост "  +  height;

        System.out.println(info);
        //scanner.close();






    }
}
