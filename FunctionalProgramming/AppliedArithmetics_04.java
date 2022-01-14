package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> add = list ->
                list.stream().map(e->e=e+1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = list ->
                list.stream().map(e->e=e*2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = list ->
                list.stream().map(e->e=e-1).collect(Collectors.toList());
       // Consumer<List<Integer>> printList= list-> list.stream().forEach(e-> System.out.print(e+" "));


        String input = scan.nextLine();
        while (!input.equals("end")) {
            switch (input) {
                case "add":
                   numbers= add.apply(numbers);

                    break;
                case "multiply":
                    numbers= multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers= subtract.apply(numbers);
                    break;
                case "print":
                    printList(numbers);
                    System.out.println();
                    break;
            }

            input = scan.nextLine();
        }


    }

    private static void printList(List<Integer> list) {
        list.forEach(e -> System.out.print(e + " "));

    }
}

