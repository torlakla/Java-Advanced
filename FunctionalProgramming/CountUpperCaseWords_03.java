package Lab.FunctionalPRograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperCaseWords_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        Predicate<String> isUpper = word -> Character.isUpperCase(word.charAt(0));
        List<String> upperList = new ArrayList<>();
        for (String word : input) {
            if (isUpper.test(word)) {
                upperList.add(word);
            }
        }
        System.out.println(upperList.size());
        for (String e : upperList) {
            System.out.println(e);
        }

    }
}

