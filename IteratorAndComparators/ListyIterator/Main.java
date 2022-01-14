package Exercise.IteratorAndComparators.ListyIterator_01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<String> data= new ArrayList<>();
                data= Arrays.stream(scan.nextLine().split(" ")).skip(1).collect(Collectors.toList());
        String input=scan.nextLine();
        ListyIterator listyIterator= new ListyIterator(data);
        while (!input.equals("END")){
            switch (input){
                case"Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try{
                    listyIterator.print();}
                    catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                    case "PrintAll":
                        listyIterator.printAll();
                        break;

            }



            input=scan.nextLine();
        }

    }
}
