package hwArray;

 import java.util.Arrays;
 import java.util.Random;

public class Array {

    public static void main(String[] args) {


        int[] myArray1 = new int[8];  //объявление и выделение памяти в одной строке кода

        //int [] myArray1 = {3,5,2,4,5,8,6,7}; // инициализация массива

        myArray1[0] = 3;
        myArray1[1] = 5;
        myArray1[2] = 2;
        myArray1[3] = 4;
        myArray1[4] = 5;
        myArray1[5] = 8;
        myArray1[6] = 6;
        myArray1[7] = 7;

        int max = 0;
        int min = 0;
        int sum = 0;

        // заполняем массив и выводим на экран
         for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " , ");
        }

        System.out.println("=====================");



        // определяем максимальное число
         for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] > max) {
                max = myArray1[i];
            }
        }
        // выводим максимальное число
        System.out.println("максимум = " + max);


        // определяем минимальное число

         for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] < min) {
                min = myArray1[i];
            }
            // выводим минимальное число
            System.out.println("минимум = " + min);
        }

        // находим сумму
        for (int i = 0; i < myArray1.length; i++) {
            sum = sum + myArray1[i];
        }

        System.out.println("сумма " + sum);


    }


    }

