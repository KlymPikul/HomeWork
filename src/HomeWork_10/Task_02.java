package HomeWork_10;

 // Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
public class Task_02 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (num <= 100 && count < 7) {
            if (num % 5 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
