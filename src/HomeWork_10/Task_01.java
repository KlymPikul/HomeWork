package HomeWork_10;

 // Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
public class Task_01 {
    public static void main(String[] args) {
        int num = 1;
        do {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num <= 100);
    }
}
