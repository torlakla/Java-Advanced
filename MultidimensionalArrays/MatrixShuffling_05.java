package Exercise.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        String[][] matrix = readMatrix(rows, cols, scan);
        String input = scan.nextLine();
       // printMatrix(matrix);
        while (!input.equals("END")) {
            String[] command = input.split("\\s+");
            if (chechValidCommand(command, rows, cols)) {
                String temp = matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])];
                matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])]=
                matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])];

                matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])] = temp;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }


    }

    private static void printMatrix(String[][] matrix) {
        for (String[] ints : matrix) {
            for (String number : ints) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private static boolean chechValidCommand(String[] command, int rows, int cols) {
        if (command.length != 5) {
            return false;
        }
        if(!command[0].equals("swap")){
            return false;
        }
        int rowIndex = Integer.parseInt(command[1]);
        if (rowIndex < 0 || rowIndex >= rows) {
            return false;
        }
        rowIndex = Integer.parseInt(command[3]);
        if (rowIndex < 0 || rowIndex >= rows) {
            return false;
        }
        int colIndex = Integer.parseInt(command[2]);
        if (colIndex < 0 || colIndex >= cols) {
            return false;
        }
        colIndex = Integer.parseInt(command[4]);
        if (colIndex < 0 || colIndex >= cols) {
            return false;
        }
        return true;
    }


    private static String[][] readMatrix(int rows, int cols, Scanner scan) {
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] =scan.nextLine().split("\\s+");
        }
        return matrix;
    }
}
