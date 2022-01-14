package Lab.Generics.GenericScale_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scale<Integer> intScale= new Scale<>(5,10);
        System.out.println(intScale.getHeavier());
        Scale<String> stringScale= new Scale<>("Alkin","Ali");
        System.out.println(stringScale.getHeavier());
    }
}
