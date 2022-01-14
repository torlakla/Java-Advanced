package Lab.FunctionalPRograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> prices= Arrays.stream(scan.nextLine().split(", ")).map(Double::parseDouble)
                .collect(Collectors.toList());
        UnaryOperator<Double> VAT=e->e*1.20;
        System.out.println("Prices with VAT:");
        for (Double price : prices) {
            System.out.printf("%.2f%n",VAT.apply(price));;

        }
    }
}
