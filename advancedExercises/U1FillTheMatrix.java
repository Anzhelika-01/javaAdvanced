package multidimensionalArrays;

import java.util.Scanner;

public class U1FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        int size = Integer.parseInt(line[0]);
        int[][] matrix = new int[size][size];
        int count = 1;
        char type = line[1].charAt(0);

        if (type == 'A') {
            readMatrixA(size, matrix, count);
        } else {
            readMatrixB(size, matrix, count);
        }
        printMatrix(size, matrix);
    }

    private static void printMatrix(int size, int[][] matrix) {
        for (int rows = 0; rows < size; rows++) {
            for (int columns = 0; columns < size; columns++) {
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }
    }

    private static void readMatrixA(int size, int[][] matrixA, int count) {
        for (int columns = 0; columns < size; columns++) {
            for (int rows = 0; rows < size; rows++) {
                matrixA[rows][columns] = count;
                count++;
            }
        }
    }

    private static void readMatrixB(int size, int[][] matrixB, int count) {
        for (int columns = 0; columns < size; columns++) {
            if (columns % 2 == 1) {
                for (int rows = size - 1; rows >= 0; rows--) {
                    matrixB[rows][columns] = count;
                    count++;
                }
            }
            else {
                for (int rows = 0; rows < size; rows++) {
                    matrixB[rows][columns] = count;
                    count++;
                }
            }
        }
    }
}