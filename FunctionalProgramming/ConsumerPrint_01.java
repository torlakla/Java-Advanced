package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] names = input.split("\\s+");
        // variant 1
        Consumer<String> printName= System.out::println;
        Arrays.stream(names).forEach(printName);

         // variant 2
        Consumer<String[]> printStrings = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };
        printStrings.accept(names);

    }
}
