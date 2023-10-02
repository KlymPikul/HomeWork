package lesson_17;

public class Lesson17 {
    public static void main(String[] args) {

        Cat cat = new Cat (); // создаём объект класса Cat

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;

        System.out.println("Имя " + catName);

        System.out.println("возраст " + cat.age);

        System.out.println("цвет " + cat.color);

        System.out.println("===================");


        // был создан новый объект класса;
        // Имя (строка), которая была передана в конструктор;
        // было присвоено поле name;

        Cat cat1 = new Cat("Max");

        System.out.println("Имя cat1 " + cat1.name);
        System.out.println("возраст " + cat1.age);
        System.out.println("цвет " + cat1.color);
        cat1.sayMeow();
        cat1.sleep();
        System.out.println("=====================");

        Cat cat2 = new Cat();
        System.out.println("Имя cat2 " + cat2.name);
        System.out.println("Возраст " +cat2.age);
        System.out.println("Цвет: " + cat2.color);
        cat2.sayMeow();
        cat2.run();
        cat2.whoAmI();
        System.out.println("=================");

        Cat cat3 = new Cat();
        System.out.println("Имя cat3 " + cat3.name);
        System.out.println("Возраст " + cat3.age);
        System.out.println("Цвет: " + cat3.color);
        cat3.sayMeow();
        cat3.whoAmI();
    }
}

