package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        ArrayDeque<String> printerQueue=new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if(printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                    input=scan.nextLine();
                    continue;
                }else{
                    System.out.println("Canceled "+printerQueue.poll());
                }
            }else {
                printerQueue.offer(input);
            }


            input=scan.nextLine();
        }
        while(!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }


    }
}
