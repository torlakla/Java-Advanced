package Exercise.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(size, scan);
        System.out.println( calculateDifference(matrix, size));
    }

    private static int calculateDifference(int[][] matrix, int size) {
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumFirst += matrix[i][i];
            sumSecond += matrix[size - 1 - i][i];
        }
        return Math.abs(sumFirst - sumSecond);
    }
    private static int[][] readMatrix(int size, Scanner scan) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
