package Exercise.MultidimentionalArrays;

import java.util.Scanner;

public class FillInTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];
        if (pattern.equals("A")) {
            matrix = readMatrixA(size);

        } else {
            matrix = readMatrixB(size);

        }
        printMatrix(matrix);
    }

    private static int[][] readMatrixB(int size) {
        int[][] matrix = new int[size][size];
        int filler = 1;
        boolean loopDirection = true;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = filler;
                    filler++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = filler;
                    filler++;

                }

            }
        }


        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arrays : matrix) {
            for (int elements : arrays) {
                System.out.print(elements + " ");

            }
            System.out.println();
        }


    }

    private static int[][] readMatrixA(int size) {
        int[][] matrix = new int[size][size];
        int filler = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = filler;
                filler++;
            }

        }

        return matrix;
    }
}
