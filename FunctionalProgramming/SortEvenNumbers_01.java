package Lab.FunctionalPRograming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input=scan.nextLine();
        String output1 =Arrays.stream(input.split(", ")).mapToInt(e->Integer.parseInt(e))
                .filter(number->number %2==0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        String output2=Arrays.stream(input.split(", ")).mapToInt(e->Integer.parseInt(e))
                .filter(number->number %2==0)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
        System.out.println(output1);
        System.out.println(output2);
    }

}
