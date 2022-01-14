package Lab.MultidimentionalsArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(rows, 0, scan);
        int[] wrongValueIndex = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int wrongValue = matrix[wrongValueIndex[0]][wrongValueIndex[1]];
        List<int[]> valuesToUpdate=new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    valuesToUpdate.add(new int[]{row,col,getSumOfElements(row, col, matrix,wrongValue)});
                }
            }
        }
        for (int[] values : valuesToUpdate) {
            matrix[values[0]][values[1]]=values[2];

        }
        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arrays : matrix) {
            for (int items : arrays) {
                System.out.print(items + " ");
            }
            System.out.println();
        }
    }

    private static int getSumOfElements(int row, int col, int[][] matrix,int wrongValue) {
        int sum = 0;
        if (col < matrix[row].length - 1 && col >= 0 && matrix[row][col + 1]!=wrongValue) {
            sum += matrix[row][col + 1];
        }
        if (col >= 1 && col < matrix[row].length && matrix[row][col - 1]!=wrongValue) {
            sum += matrix[row][col - 1];
        }
        if (row < matrix.length - 1 && row >= 0 && matrix[row + 1][col]!= wrongValue) {
            sum += matrix[row + 1][col];
        }
        if (row >= 1 && row < matrix.length && matrix[row - 1][col]!=wrongValue) {
            sum += matrix[row - 1][col];
        }

        return sum;
    }

    private static void replaceWrongValues(int[][] matrix, int wrongValue) {
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
