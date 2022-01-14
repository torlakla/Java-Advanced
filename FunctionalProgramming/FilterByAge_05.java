package Lab.FunctionalPRograming;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        LinkedHashMap<String,Integer> list=new LinkedHashMap<>();
        for (int i = 0; i <n; i++) {
            String input=scan.nextLine();
            String name=input.split(", ")[0];
            int age=Integer.parseInt(input.split(", ")[1]);
            list.putIfAbsent(name,age);
        }
        String condition=scan.nextLine();
        int ageLimit=Integer.parseInt(scan.nextLine());
        String format=scan.nextLine();


    }
}
