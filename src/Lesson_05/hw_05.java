package Lesson_05;

//Task 01

//      Создайте переменную с типом String, в которой будет хранится ВАше имя.
//    Сколько букв в вашем имени? Выведите значение на экран
//  Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
//Выведите на экран десятичный код первого и последнего символа вашего имени


import java.util.Scanner;

public class hw_05 {
    public static void main(String[] args) {
        String name = "Klym";

        System.out.println("В имени " + name.length() + " символов");

        char first = 75;
        char last = 109;

        System.out.println(first);
        System.out.println(last);
    }
}
