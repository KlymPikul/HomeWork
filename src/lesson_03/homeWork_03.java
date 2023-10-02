package lesson_03;

// Задача 1. Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
// Объявите ещё одну переменную int и сохраните в неё сумму этих переменных,
// деленную на 10. Получается, у вас будет среднее арифметическое этих чисел
// в одной переменной. Распечатайте её через println. Сколько программа
// отбросила в дробной части?

public class homeWork_03 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int o = 7;
        int l = 8;
        int m = 9;

        int sum = (a + b + c + d + e + f + g + o + l + m);

        // System.out.println("sum " + sum);

        int rezult = sum / 10;

        System.out.println("rezult " + rezult);

        //int restDiv = double sum / 10;
        System.out.println("остаток от деления: " + ((double) sum / 10 - rezult));

    }














}
