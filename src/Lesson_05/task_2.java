package Lesson_05;

//  ask 02 Создайте строки:
//
//"Java"
//"is"
//"a"
//"powerful"
//"language"
//Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
//
//Распечатать эту строку и ее длину

public class task_2 {
    public static void main(String[] args) {
        String str1  = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String result1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println(result1 + " {строка имеет длину " + result1.length() + " символов}");

        System.out.println("==============================");

        // Task_2.2

        // Заменяем "powerful" на "super" в результирующей строке
        result1 = result1.replace("powerful", "super");

        // Проверяем, содержит ли строка "age"
        boolean containsAge = result1.contains("age");

        // Печатаем измененную строку и результат проверки
        System.out.println(result1);
        System.out.println("Содержит 'age': " + containsAge);




    }
}
