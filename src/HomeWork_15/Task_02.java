package HomeWork_15;

/*
Task 3

Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task_02 {
    public static String[] findMinMaxLengthStrings(String[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new String[0]; // Возвращаем пустой массив, если входной массив пуст или равен null.
        }

        String shortest = inputArray[0];
        String longest = inputArray[0];

        for (String str : inputArray) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        String[] resultArray = {shortest, longest};
        return resultArray;
    }

    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "cherry", "tangerine", "orange"};

        String[] result = findMinMaxLengthStrings(inputArray);

        System.out.println("Shortest string: " + result[0]);
        System.out.println("Longest string: " + result[1]);
    }
}
