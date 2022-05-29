package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class U2MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = line[0];
        int cols = line[1];
        String[][] matrix = new String[rows][cols];

        readMatrix(rows, cols, matrix);
        printMatrix(rows, cols, matrix);
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static void readMatrix(int rows, int cols, String[][] matrix) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char outside = (char) ('a' + r);
                char middle = (char) (outside + c);
                matrix[r][c] = String.valueOf(outside) + middle + outside;
            }
        }
    }
}
