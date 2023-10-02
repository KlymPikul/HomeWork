package lesson_03;

//  Задача 2. Пусть цена товара A обычно составляет 1000 Euro, и товара B
//  составляет 500 Euro. Если клиент покупает товары вместе, то на них
//  действует скидка 10% на всю покупку. Выведите на экран переменную,
//  которая соответствует стоимости суммы A+B со скидкой.
//  Отдельно выведите на экран сумму скидки от этой покупки.


public class hw_task_02 {
    public static void main(String[] args) {

        int a = 1000;
        int b = 500;

        double sum = (a + b);
        System.out.println("сумма " + sum);

        double promo = sum / 10;
        System.out.println("promo " + promo);

        double rezult = sum - promo;
        System.out.println("цена со скидкой " + rezult);

    }
}
