package Lab.FunctionalPRograming;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        if (numbers.size() < 2) {
            System.out.println("Count = " + numbers.size());
            System.out.println("Sum = " + numbers.get(0));
        } else {
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Count = " + numbers.size());
            System.out.println("Sum = " + sum);
        }

//        int sum= Arrays.stream(input.split(", "))
//                .mapToInt(Integer::parseInt).sum();
//        long count=Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).count();
//        System.out.println("Count = "+ count);
//        System.out.println("SUm = "+ sum);
//

    }
}
