package Exercise.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonour_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] names = input.split("\\s+");


        Consumer<String[]> printStrings = array -> {
            for (String name : array) {
                System.out.println("Sir " + name);
            }
        };
        printStrings.accept(names);

    }
}

