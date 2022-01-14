package EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] length = new int[1];
        length[0] = 1;
        int[] food = new int[1];
        int size = Integer.parseInt(scan.nextLine());
        int[] position = new int[2];
        String[] commands = (scan.nextLine().split(", "));
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            String[] input = scan.nextLine().split("\\s+");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input[j].charAt(0);
                if (input[j].equals("s")) {
                    position[0] = i;
                    position[1] = j;
                }
            }
            ;
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'f') {
                    food[0] += 1;
                }
            }
        }
        label:
        for (String command : commands) {
            int row = position[0];
            int col = position[1];
            int nextRow = 0;
            int nextCol = 0;
            boolean isKilled = false;
            switch (command) {
                case "up":
                    nextRow = row - 1;
                    nextCol = col;
                    if (nextRow < 0) {
                        nextRow = size - 1;
                    } else if (nextRow >= size) {
                        nextRow = 0;
                    }
                    if (nextCol < 0) {
                        nextCol = size - 1;
                    } else if (nextCol >= size) {
                        nextCol = 0;
                    }
                    if (matrix[nextRow][nextCol] == 'e') {
                        System.out.println("You lose! Killed by an enemy!");
                        return;
                    } else if (matrix[nextRow][nextCol] == 'f') {
                        length[0] += 1;
                        matrix[nextRow][nextCol] = '*';
                        position[0] = nextRow;
                        position[1] = nextCol;
                    } else {
                        position[0] = nextRow;
                        position[1] = nextCol;
                    }
                    if (length[0] - 1 == food[0]) {
                        System.out.println("You win! Final python length is " + length[0]);
                        return;
                    }

                    break;
                case "down":
                    nextRow = row + 1;
                    nextCol = col;
                    if (nextRow < 0) {
                        nextRow = size - 1;
                    } else if (nextRow >= size) {
                        nextRow = 0;
                    }
                    if (nextCol < 0) {
                        nextCol = size - 1;
                    } else if (nextCol >= size) {
                        nextCol = 0;
                    }
                    if (matrix[nextRow][nextCol] == 'e') {
                        System.out.println("You lose! Killed by an enemy!");
                        return;
                    } else if (matrix[nextRow][nextCol] == 'f') {
                        length[0] += 1;
                        matrix[nextRow][nextCol] = '*';
                        position[0] = nextRow;
                        position[1] = nextCol;
                    } else {
                        position[0] = nextRow;
                        position[1] = nextCol;
                    }
                    if (length[0] - 1 == food[0]) {
                        System.out.println("You win! Final python length is " + length[0]);
                        return;
                    }

                    break;
                case "left":
                    nextRow = row;
                    nextCol = col - 1;
                    if (nextRow < 0) {
                        nextRow = size - 1;
                    } else if (nextRow >= size) {
                        nextRow = 0;
                    }
                    if (nextCol < 0) {
                        nextCol = size - 1;
                    } else if (nextCol >= size) {
                        nextCol = 0;
                    }
                    if (matrix[nextRow][nextCol] == 'e') {
                        System.out.println("You lose! Killed by an enemy!");
                        return;
                    } else if (matrix[nextRow][nextCol] == 'f') {
                        length[0] += 1;
                        matrix[nextRow][nextCol] = '*';
                        position[0] = nextRow;
                        position[1] = nextCol;
                    } else {
                        position[0] = nextRow;
                        position[1] = nextCol;
                    }
                    if (length[0] - 1 == food[0]) {
                        System.out.println("You win! Final python length is " + length[0]);
                        return;
                    }

                    break;
                case "right":
                    nextRow = row;
                    nextCol = col + 1;
                    if (nextRow < 0) {
                        nextRow = size - 1;
                    } else if (nextRow >= size) {
                        nextRow = 0;
                    }
                    if (nextCol < 0) {
                        nextCol = size - 1;
                    } else if (nextCol >= size) {
                        nextCol = 0;
                    }
                    if (matrix[nextRow][nextCol] == 'e') {
                        System.out.println("You lose! Killed by an enemy!");
                        return;
                    } else if (matrix[nextRow][nextCol] == 'f') {
                        length[0] += 1;
                        matrix[nextRow][nextCol] = '*';
                        position[0] = nextRow;
                        position[1] = nextCol;
                    } else {
                        position[0] = nextRow;
                        position[1] = nextCol;
                    }
                    if (length[0] - 1 == food[0]) {
                        System.out.println("You win! Final python length is " + length[0]);
                        return;
                    }

                    break;

            }
        }

        System.out.printf("You lose! There is still %d food to be eaten.", food[0]+1 - length[0]);
    }
}

