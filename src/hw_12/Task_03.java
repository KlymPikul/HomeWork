package hw_12;

public class Task_03 {
    public static void main(String[] args) {
        int n = 6; // Количество строк

        // Внешний цикл для строк
        for (int i = 1; i <= n; i++) {
            // Внутренний цикл для чисел в каждой строке
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Перейти на новую строку после вывода каждой строки
        }
    }
}
