package Exercise.MultidimentionalArrays;

import java.util.Scanner;

public class MatrixPalindrome_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows=scan.nextInt();
        int cols= scan.nextInt();
        String[][] matrix= readMatrix(rows,cols);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+ " ");

            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(int rows,int cols) {
        char firstSymbol='a';
        char secondSymbol='a';
        String[][] matrix=new String[rows][cols];
        for (int row = 0; row <matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String tofill=""+ (char)(firstSymbol+row) +(char)(secondSymbol+row+col)+(char)(firstSymbol+row);

                matrix[row][col]=tofill;

            }

        }
        return matrix;
    }
}
