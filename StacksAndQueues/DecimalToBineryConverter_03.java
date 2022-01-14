package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBineryConverter_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input=Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> converter= new ArrayDeque<>();
        if(input==0){
            System.out.println(0);
            return;
        }
        int current=0;
        while (input!=0){
            current=input%2;
            converter.push(current);
            input=input/2;
        }
        while(!converter.isEmpty()){
            System.out.print(converter.pop());
        }

    }
}
