package Exercise.FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scan.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int divisibleNum=Integer.parseInt(scan.nextLine());

        Predicate<Integer> isDivisible= e->e % divisibleNum!=0;
        Collections.reverse(numbers);
        numbers.stream()
                .filter(isDivisible)
                .forEach(e-> System.out.print(e+ " "));

    }
}
