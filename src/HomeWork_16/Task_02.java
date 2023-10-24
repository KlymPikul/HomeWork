package HomeWork_16;

public class Task_02 {
    public static String getSubstring(String str, int startIndex) {
        if (startIndex < 0 || startIndex >= str.length()) {
            // Проверка на корректность индекса
            System.out.println("Некорректный индекс");
            return null;
        }
        return str.substring(startIndex);
    }

    public static String getSubstring(String str, int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= str.length() || endIndex < startIndex || endIndex > str.length()) {
            // Проверка на корректность индексов
            System.out.println("Некорректные индексы");
            return null;
        }
        return str.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String input = "123456789";

        // Используем первую версию метода (только начальный индекс)
        String substring1 = getSubstring(input, 1);
        System.out.println("Подстрока (с индекса 1): " + substring1);

        // Используем вторую версию метода (начальный и конечный индексы)
        String substring2 = getSubstring(input, 2, 5);
        System.out.println("Подстрока (с индекса 2 до 5): " + substring2);
    }
}
