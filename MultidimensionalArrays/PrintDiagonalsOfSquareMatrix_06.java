package Lab.MultidimentionalsArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(matrixSize, scan);
        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        int col = 0;
        for (int row = 0; row < matrixSize; row++) {
            firstDiagonal.add(matrix[row][col]);
            col++;
        }
        col = 0;
        for (int row = matrixSize - 1; row >= 0; row--) {
            secondDiagonal.add(matrix[row][col]);
            col++;


        }
        printList(firstDiagonal);
        printList(secondDiagonal);

    }

    private static void printList(List<Integer> output) {
        for (Integer element : output) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    private static int[][] readMatrix(int size, Scanner scan) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
        return matrix;


    }
}