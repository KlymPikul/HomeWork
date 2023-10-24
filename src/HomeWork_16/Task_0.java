package HomeWork_16;
/*
Task 0

Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.

toUpperCase() использовать низзя.
 */
public class Task_0 {
    public static void main(String[] args) {
        String inputString = "This is Klym Pikul";
        String convertedString = convertToLowercase(inputString);
        System.out.println("Converted String: " + convertedString);
    }

    public static String convertToLowercase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                // преобразование символа нижнего регистра в верхний регистр
                // путем вычитания 32 из его значения ASCII
                charArray[i] = (char) (charArray[i] - 32);
            }
        }
        return String.valueOf(charArray);
    }
}





