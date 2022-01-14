package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SImpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[]input = scan.nextLine().split("\\s+");
        ArrayDeque<String> calculator = new ArrayDeque<>();

       Collections.addAll(calculator,input);
        while (calculator.size()>1){

            int firstNum=Integer.valueOf(calculator.pop());
            String operation=calculator.pop();
            int secondNum=Integer.valueOf(calculator.pop());
            int sum= operation.equals("-")
                    ?firstNum-secondNum
                    :firstNum+secondNum;
            calculator.push(String.valueOf(sum));

        }
        System.out.println(calculator.peek());

    }
}
