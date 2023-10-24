package lesson_22;
import java.util.Arrays;
public class MainArraysUtil {

    public static void main(String[] args) {
        int[] ints = {25, 13, -56, 44, 57, 78, 34, 8, 10, 77, -25, 34};
        int searchMe = 100;

        ArraysUtil.sortArray(ints);

        System.out.println(Arrays.toString(ints));
    }
}

