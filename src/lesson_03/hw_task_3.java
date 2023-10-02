package lesson_03;


// Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
// Вычислите среднюю температуру за неделю и выведете ее на печать.

public class hw_task_3 {
    public static void main(String[] args) {

        int temp1 = 25;
        int temp2 = 23;
        int temp3 = 26;
        int temp4 = 25;
        int temp5 = 28;
        int temp6 = 23;
        int temp7 = 31;

        int coutValues = 7;

        double averageTemp;
        averageTemp = ((double) temp1 + temp2 +temp3 + temp4 + temp5 + temp6 + temp7) / coutValues;

        // System.out.println("Среднее значение температуры " + averageTemp);

        System.out.printf("Среднее значение температуры: %.2f ", averageTemp);



    }
}
