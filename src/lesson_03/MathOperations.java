package lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        //    20 + 7
        int result = a + b; // сложение
        System.out.println("Результат: " + result);

        // результат вычислений выражения, находящегося справа от знака "="
        // будет вычислен и результат помещён в переменную, и которая находится слева от знака "="

        result = a - b;

        result = a * b;
        System.out.println("Результат умножения a * b:" + a + " * " + b + " + " + result);

        int test = 10 / 2;
        System.out.println(test);

        int resultDiv = a / b; // целочисленное деление / 2.857...
        System.out.println("Результат деления: " + resultDiv);

        // Остаток от деления
        int restDiv = a % b;
        System.out.println("остаток от деления: " + restDiv);

        System.out.println(21 % 7);


        System.out.println();
        System.out.println(" ======================== ");

        float floatVar;
        floatVar = 20.0f;

        double doubleVar = 20.0d;
        double doubleVar2 = 20.0;
        double doubleSeven = 7.0;

        double resultDoubleDiv = doubleVar / doubleSeven;
        System.out.println(resultDoubleDiv);


        System.out.printf("Результат деления 20 на 7 равен %.2f", resultDoubleDiv, doubleSeven);

        System.out.println();
        System.out.println("Приведение типов");


        int intVar1 = 20;
        int intVar2 = 7;

        //                  20.0 / 7.0
        double resultDouble = (double) intVar1 / intVar2;
        System.out.println("Результат после приведения типов " + resultDouble);

        int resultInt = (int) (doubleVar / doubleSeven);
        System.out.println("int from double " + resultInt);

        double varDoub = 20;
        System.out.println(varDoub);

        long longVar = 10L;
        int x = (int) longVar;
        longVar = x;





    }
}
