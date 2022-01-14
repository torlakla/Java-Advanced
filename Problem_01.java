package EXAM;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(tasks::push);
        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(threads::offer);

        int taskToKill = Integer.parseInt(scan.nextLine());
        boolean isKilled = false;
        while (!isKilled) {
            int currentTask = 0;
            int currentThread = 0;
            if (!tasks.isEmpty()) {
                currentTask = tasks.peek();
            }
            if (!threads.isEmpty()) {
                currentThread = threads.peek();
            }
            if (currentTask == taskToKill) {
                int killedTask = tasks.pop();
                System.out.printf("Thread with value %d killed task %d%n", currentThread, killedTask);
                while(!threads.isEmpty()) {
                    System.out.print(threads.poll() + " ");
                }
                isKilled = true;
                break;
            }
            if (currentThread >= currentTask) {
                tasks.pop();
                threads.poll();
            } else {
                threads.poll();
            }
        }


    }
}
