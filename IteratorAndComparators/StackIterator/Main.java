package Exercise.IteratorAndComparators.StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Stack<Integer> stack = new Stack<>();
        while (!input.equals("END")) {
            String[] command = input.split("[, ]+");
            if (command[0].equals("Push")) {
                for (int i = 1; i < command.length; i++) {
                    stack.push(Integer.parseInt(command[i]));
                }
            } else if (command[0].equals("Pop")) {
                stack.pop();
            }


            input = scan.nextLine();
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
