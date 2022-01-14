package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> players = new ArrayDeque<>();
        Collections.addAll(players, input);
        int n = Integer.parseInt(scan.nextLine());


        while (players.size() > 1) {


            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.println("Removed " + players.poll());
                    break;
                }
                String currentPlayer = players.poll();
                players.offer(currentPlayer);
            }

        }
        System.out.println("Last is " + players.poll());
    }
}
