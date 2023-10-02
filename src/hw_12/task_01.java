package hw_12;

//Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив,
// количество четных чисел в массиве и сумму всех четных чисел.

import java.util.Random;

public class task_01 {
    public static void main(String[] args) {


        int count = 0;
        int sum = 0;

        int len = 20;
        Random random = new Random();

        int[] array = new int[len];

        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(101);

            System.out.print(array[j] + ", ");
            System.out.println();


            //for (int j = 0; j < array.length; j++) {

                if (array[j] % 2 == 0) {
                    count++;
                    sum += array[j];

                    System.out.println("Количество четных чисел: " + count);
                    System.out.println("Сумма четных чисел: " + sum);
                }
            }


        }


    }



