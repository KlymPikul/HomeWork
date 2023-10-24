package HomeWork_13;

/*
Task 1

Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени
это Число

класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task_02 {
    public static void main(String[] args) {
        int number = 7; // Замените 7 на любое целое число, которое вы хотите возвести в степень 2.
        calculatePowerOfTwo(number);
    }

    public static void calculatePowerOfTwo(int number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= 2;
        }
        System.out.println("2 в степени " + number + " равно " + result);
    }
}
