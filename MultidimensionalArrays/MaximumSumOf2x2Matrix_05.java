package Lab.MultidimentionalsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Matrix_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols, scan);
        int[] startIndex = new int[2];
        int sum = calculateSum2x2(matrix, startIndex);
        printMatrix(matrix, startIndex);
        System.out.println(sum);

    }

    private static void printMatrix(int[][] matrix, int[] startIndex) {
//        for (int rows = startIndex[0]; rows <= startIndex[0] + 1; rows++) {
//            for (int cols = startIndex[1]; cols <= startIndex[1] + 1; cols++) {
//                System.out.print(matrix[rows][cols] + " ");
//
//            }
//            System.out.println();
//
//        }
        System.out.println(matrix[startIndex[0]][startIndex[1]] + " " +matrix[startIndex[0]][startIndex[1]+1]);
        System.out.println(matrix[startIndex[0]+1][startIndex[1]] + " "+ matrix[startIndex[0]+1][startIndex[1]+1]);


    }


    private static int calculateSum2x2(int[][] matrix, int[] startIndex) {
        int bestSum = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum;
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    startIndex[0] = row;
                    startIndex[1] = col;

                }

            }

        }


        return bestSum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}
