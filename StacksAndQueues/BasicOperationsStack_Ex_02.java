package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicOperationsStack_Ex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        int s= scan.nextInt();
        int x=scan.nextInt();
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        for (int i = 0; i <n; i++) {
            stack.push(scan.nextInt());
        }
        for (int i = 0; i <s; i++) {
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println("0");
        }else {
            if(stack.contains(x)){
                System.out.println("true");
            }else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
