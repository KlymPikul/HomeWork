package hwArray_Lesson_11;
/* Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива

        { “One”, “Two”, “Twenty” } -->

        T
        w
        e
        n
        t
        y

        */

public class Task_02 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Twenty"};

        // Найдем самую длинную строку в массиве
        String longestString = strings[0];

        int i = 0;
        while (i < strings.length) {
            if (strings[i].length() > longestString.length()) {
                longestString = strings[i];
            }
            i++;
        }
        System.out.println("Самая длинная строка в массиве " + longestString);


        int k =0;
        while (k < longestString.length()) {
            System.out.println(longestString.charAt(k++));
        }


    }
}
