package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numCommands = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numCommands; i++) {
            String command = scan.nextLine();
            switch (command) {
                case "3":
                    System.out.println(Collections.max(stack));

                    break;
                case "2":
                    stack.pop();

                    break;
                default:
                    int toPush=Integer.parseInt(command.split(" ")[1]);
                    stack.push(toPush);
                    break;
            }

        }
    }
}
