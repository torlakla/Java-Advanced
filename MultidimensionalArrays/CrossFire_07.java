package Exercise.MultidimentionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossFire_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dims = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsMatrix = dims[0];
        int colsMatrix = dims[1];
        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rowsMatrix, colsMatrix);
        String input = scan.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] command = getInput(input);
            int rows = command[0];
            int cols = command[1];
            int radius = command[2];
            // destroys up and down
            for (int row = rows - radius; row < rows + radius; row++) {
                matrix.get(row).remove(cols);
            }



            input = scan.nextLine();
        }
    }

    private static int[] getInput(String input) {
        return Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number);
                number++;

            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
