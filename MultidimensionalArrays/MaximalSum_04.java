package Exercise.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols, scan);
        int bestSum = 0;
        int sum = 0;
        int[] bestSumIndex=new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum = calculateMaxSum(matrix, row, col);
                if (sum > bestSum) {
                    bestSum = sum;
                    bestSumIndex[0]=row;
                    bestSumIndex[1]=col;
                }
            }
        }
        System.out.println("Sum = "+ bestSum);
        printMatrix(matrix,bestSumIndex);
    }

    private static void printMatrix(int[][] matrix, int[] bestSumIndex) {
        for (int rows = bestSumIndex[0]; rows <bestSumIndex[0]+3; rows++) {
            for (int cols = bestSumIndex[1]; cols <bestSumIndex[1]+3; cols++) {
                System.out.print(matrix[rows][cols]+ " ");
            }
            System.out.println();
        }
    }

    private static int calculateMaxSum(int[][] matrix, int row, int col) {
        int sum = 0;
        if (row + 3 <=matrix.length) {
            for (int rows = row; rows < row + 3; rows++) {
                if (col + 3 <=matrix[row].length) {
                    for (int cols = col; cols < col + 3; cols++) {
                        sum += matrix[rows][cols];
                    }
                }
            }
        }
        return sum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
