package Lesson_08;

import java.util.Random;
public class HW_08_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int grade = random.nextInt(13); // Генерируем случайное число от 0 до 12
        int remainingTime = 45; // Оставшееся время на сегодня

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Вы очень рады оценке! Похвалите ребенка.");
                remainingTime += 60; // Добавляем 60 минут
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Слова похвалы на экран.");
                remainingTime += 45; // Добавляем 45 минут
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Нейтральные слова.");
                remainingTime += 15; // Добавляем 15 минут
                break;
            case 3:
                System.out.println("Огорчитесь. Оценка неудовлетворительная.");
                remainingTime -= 30; // Вычитаем 30 минут
                break;
            default:
                System.out.println("Трагедия. Сегодня ТВ смотреть запрещено.");
                remainingTime = 0; // Устанавливаем время просмотра ТВ в 0
                break;
        }

        System.out.println("Оставшееся на сегодня время для просмотра ТВ: " + remainingTime + " минут");
    }
}
