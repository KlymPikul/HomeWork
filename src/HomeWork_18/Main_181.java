package HomeWork_18;

public class Main_181 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Барон", 30);
        Dog dog2 = new Dog("Рекс", 40);

        dog1.jump(35); // Попытка перепрыгнуть барьер
        dog1.train(); // Тренировка
        dog1.jump(35); // Повторная попытка после тренировки

        dog2.jump(50); // Попытка перепрыгнуть барьер
        dog2.jump(45); // Попытка перепрыгнуть барьер
        dog2.train(); // Тренировка
        dog2.jump(45); // Повторная попытка после тренировки
    }
}
