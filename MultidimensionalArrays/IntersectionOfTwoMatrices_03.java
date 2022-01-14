package Lab.MultidimentionalsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows=Integer.parseInt(scan.nextLine());
        int cols=Integer.parseInt(scan.nextLine());
        char[][] firstMatrix=readMatrix(rows,cols,scan);
        char[][] secondMatrix=readMatrix(rows,cols,scan);

        char[][] outputMatrix= new char[rows][cols];
        matrixIntersection(firstMatrix, secondMatrix, outputMatrix);
        printMatrix(outputMatrix);


    }

    private static void matrixIntersection(char[][] firstMatrix, char[][] secondMatrix, char[][] outputMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(firstMatrix[row][col]== secondMatrix[row][col]){
                    outputMatrix[row][col]= firstMatrix[row][col];
                }else {
                    outputMatrix[row][col]='*';
                }

            }

        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] array :matrix) {
            for (char element:array ) {
                System.out.print(element+ " ");

            }
            System.out.println();

        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix= new char[rows][cols];
        for (int row = 0; row <matrix.length; row++) {
            String[] input=scan.nextLine().split(" ");
            for (int col = 0; col <input.length; col++) {
                matrix[row][col]=input[col].charAt(0);


            }

        }
        return matrix;
    }
}
