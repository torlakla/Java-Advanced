package Lab.MultidimentionalsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementsMatrix_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int rows = Integer.parseInt(input.split(", ")[0]);
        int cols = Integer.parseInt(input.split(", ")[1]);
        int[][] matrix = readMatrix(rows,cols,scan);
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(calculateSum(matrix));
    }

    private static int calculateSum(int[][] matrix) {
//        int sum=0;
//        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();


        int sum=0;
        for (int[] array : matrix) {
            for (int element : array) {
                sum+=element;
            }

        }

        return sum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }
        return  matrix;
    }
}
