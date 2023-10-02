package Lesson_06;


// Task 01 со звездочкой Построчно сократить логическое выражения (соблюдая приоритетность операций)
//
//System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));

public class HomeWork_06 {
    public static void main(String[] args) {

        boolean aa = true;
        boolean bb = false;
        int cc = 45;
        int qq = 6;
        //System.out.println(aa | bb | (cc < 100) & !aa ^ (qq == 5));

        System.out.println((true | false) | (cc < 70) & !(true) ^ (qq == 5));
        System.out.println(true | (cc < 70) & !(true) ^ (qq == 5)); // | (OR) - true
        System.out.println(true | true & !(true) ^ false); // cc < 70 - true; qq == 5 - false

        //System.out.println(true | true & !(true) ^ false);

        System.out.println(true | true ^ false); // ^ ИЛИ (XOR) - true
        System.out.println(true | true);  // |    Логическое ИЛИ (OR)- true
        System.out.println(true);

    }
}



//      Task 00
//
//Создайте переменную типа int.
//Получите произвольное значение переменной из консоли (используем Scanner)
//Выведите строку в формате:
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
//(опционально) - учесть, что случайное число может оказаться 0

