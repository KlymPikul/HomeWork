package HomeWork_13;

/*
Task 2 опционально

    Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()

    на вход принимает массив целых чисел и число - длинну нового массива. Метод должен создать
    и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы
    элементы из входящего массива:

    {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
public class Task_03 {
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5, 6};
        int[] copiedArray = copyOfArray(originalArray, 3);
        printArray(copiedArray);
    }

    public static int[] copyOfArray(int[] sourceArray, int newLength) {
        if (newLength < 0) {
            throw new IllegalArgumentException("Новая длина массива должна быть неотрицательной.");
        }

        int[] newArray = new int[newLength];
        int minLength = Math.min(sourceArray.length, newLength);

        for (int i = 0; i < minLength; i++) {
            newArray[i] = sourceArray[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
