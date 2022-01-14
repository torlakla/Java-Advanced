package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        ArrayDeque<Integer> bracketPosition=new ArrayDeque<>();
        for (int i = 0; i <input.length(); i++) {
            char currentSymbol=input.charAt(i);
            if (currentSymbol=='('){ ;
                bracketPosition.push(i);
            }else if(currentSymbol==')'){
                int startIndex=bracketPosition.pop();
                String output=input.substring(startIndex,i+1);
                System.out.println(output);
            }

        }
    }
}
