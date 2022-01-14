package ExamPrep.Snake_02;

import java.util.Arrays;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[] position = new int[2];
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            String input = scan.nextLine();
            matrix[i] = input.toCharArray();
            if (input.contains("S")) {
                position[1] = input.indexOf("S");
                position[0] = i;
            }
        }
        int[] food = new int[1];
        boolean isLost = false;

        label:
        while (food[0] < 10) {
            String command = scan.nextLine();
            int row = position[0];
            int col = position[1];
            int nextCol = 0;
            int nextRow = 0;
            switch (command) {
                case "up":
                    nextRow = row - 1;
                    nextCol = col;
                    if (!checkIndex(nextRow, nextCol, size)) {
                        isLost = true;
                        break label;
                    }
                    moveSnake(nextRow, nextCol, food, matrix, position, row, col);
                    break;
                case "down":
                    nextRow = row + 1;
                    nextCol = col;
                    if (!checkIndex(nextRow, nextCol, size)) {
                        isLost = true;
                        break label;
                    }
                    moveSnake(nextRow, nextCol, food, matrix, position, row, col);
                    break;
                case "left":
                    nextRow = row;
                    nextCol = col - 1;
                    if (!checkIndex(nextRow, nextCol, size)) {
                        isLost = true;
                        break label;
                    }
                    moveSnake(nextRow, nextCol, food, matrix, position, row, col);
                    break;
                case "right":
                    nextRow = row;
                    nextCol = col + 1;
                    if (!checkIndex(nextRow, nextCol, size)) {
                        isLost = true;
                        break label;
                    }
                    moveSnake(nextRow, nextCol, food, matrix, position, row, col);
                    break;
            }
        }
        if (food[0] >= 10) {
            System.out.println("You won! You fed the snake.");
        }
        if (isLost) {
            System.out.println("Game over!");
            matrix[position[0]][position[1]]='.';
        }
        System.out.println("Food eaten: " + food[0]);
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);

            }
            System.out.println();
        }

    }


    private static boolean checkIndex(int row, int col, int size) {
        if (row < 0 || row > size - 1) {
            return false;
        }
        if (col < 0 || col > size - 1) {
            return false;
        }
        return true;
    }

    private static void moveSnake(int nextRow, int nextCol, int[] food, char[][] matrix, int[] position, int row, int col) {
        if (matrix[nextRow][nextCol] == '*') {
            food[0] = food[0] + 1;
            matrix[nextRow][nextCol] = 'S';
            matrix[row][col] = '.';
            position[0] = nextRow;
            position[1] = nextCol;
        } else if (matrix[nextRow][nextCol] == 'B') {
            matrix[nextRow][nextCol] = '.';
            matrix[row][col] = '.';
            position[0] = nextRow;
            position[1] = nextCol;
            label:
            for (int rows = 0; rows < matrix.length; rows++) {
                for (int cols = 0; cols < matrix.length; cols++) {
                    if (matrix[rows][cols] == 'B') {
                        matrix[rows][cols] = 'S';
                        position[0] = rows;
                        position[1] = cols;
                        break label;
                    }
                }

            }
        } else if (matrix[nextRow][nextCol] == '-') {
            matrix[nextRow][nextCol] = 'S';
            matrix[row][col] = '.';
            position[0] = nextRow;
            position[1] = nextCol;

        }
    }


}
