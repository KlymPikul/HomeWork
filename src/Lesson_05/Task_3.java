package Lesson_05;

public class Task_3 {

    public static void main(String[] args) {
        String[] strings = {"string", "code", "Practice"};

        for (String str : strings) {
            String result = getMiddleChars(str);
            System.out.println(result);
        }
    }

    public static String getMiddleChars(String str) {
        int length = str.length();
        int middle = length / 2;
        return str.substring(middle - 1, middle + 1);
    }
}





