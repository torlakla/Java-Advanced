package Lab.MultidimentionalsArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionOf_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowsAndCols = readArray(scan.nextLine());
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = readMatrix(rows, cols, scan);
        int element = Integer.parseInt(scan.nextLine());
        List<int[]> output = new ArrayList<>();


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (element == matrix[row][col]) {
                    output.add(new int[]{row, col});

                }

            }

        }
        if (output.isEmpty()) {
            System.out.println("not found");
        } else {
            for (int[] e : output) {
                System.out.println(e[0] + " " + e[1]);
            }

        }
    }


    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan.nextLine());
        }
        return matrix;
    }

    private static int[] readArray(String line) {
        return Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
