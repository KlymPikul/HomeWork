package Lesson_14;







import java.util.Random;
import java.util.Scanner;


public class battle {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        initializeBoard(board);
        placeTarget(board);

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetSize = random.nextInt(3) + 2; // Randomly choose target size (2, 3, or 4)

        int targetHitCount = 0;

        while (true) {
            printBoard(board);

            int row, col;
            do {
                System.out.print("Enter the row (1-5): ");
                row = scanner.nextInt();
            } while (row < 1 || row > 5);

            do {
                System.out.print("Enter the column (1-5): ");
                col = scanner.nextInt();
            } while (col < 1 || col > 5);

            if (board[row - 1][col - 1] == 'x') {
                System.out.println("You've already fired at this position.");
            } else if (board[row - 1][col - 1] == 'T') {
                targetHitCount++;
                board[row - 1][col - 1] = 'x';
                System.out.println("Direct hit!");
                if (targetHitCount == targetSize) {
                    printBoard(board);
                    System.out.println("You have won!");
                    break;
                }
            } else {
                board[row - 1][col - 1] = '*';
                System.out.println("Missed!");
            }
        }
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void placeTarget(char[][] board) {
        Random random = new Random();
        int targetSize = random.nextInt(3) + 2;
        int row = random.nextInt(5);
        int col = random.nextInt(5);

        int direction = random.nextInt(2); // 0 for horizontal, 1 for vertical

        if (direction == 0) {
            if (col + targetSize <= 5) {
                for (int i = 0; i < targetSize; i++) {
                    board[row][col + i] = 'T';
                }
            } else {
                // Try placing vertically instead
                direction = 1;
            }
        }

        if (direction == 1) {
            if (row + targetSize <= 5) {
                for (int i = 0; i < targetSize; i++) {
                    board[row + i][col] = 'T';
                }
            } else {
                // Try placing horizontally instead
                direction = 0;
                for (int i = 0; i < targetSize; i++) {
                    board[row][col + i] = 'T';
                }
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
