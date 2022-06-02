package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class U3DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        int rightSum = 0;
        int leftSum = 0;

        for (int rows = 0; rows < sizeOfMatrix; rows++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int count = 0;
            for (int cols = 0; cols < sizeOfMatrix; cols++) {
                matrix[rows][cols] = line[count];
                count++;
            }
        }
        for (int rows = 0; rows < sizeOfMatrix; rows++) {
            for (int cols = 0; cols < sizeOfMatrix; cols++) {
                if (rows == cols) {
                    leftSum += matrix[rows][cols];
                }
            }
        }
        int i = 0;
        for (int cols = sizeOfMatrix - 1; cols >= 0; cols--) {
            rightSum += matrix[i][cols];
            i++;
        }
        System.out.println(Math.abs(rightSum - leftSum));
    }
}
