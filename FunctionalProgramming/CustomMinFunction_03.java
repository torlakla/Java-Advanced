package Exercise.FunctionalProgramming;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers= Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//       int min= Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
//        System.out.println(min);

        Function<int[],Integer> minNumber = element->Arrays.stream(element).min().orElse(Integer.MIN_VALUE);
        System.out.println(minNumber.apply(numbers));


    }
}
