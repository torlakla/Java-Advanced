package Lab.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> vipGuests = new TreeSet<>();
        TreeSet<String> regularGuests = new TreeSet<>();
        String input = scan.nextLine();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }
            input = scan.nextLine();

        }
        System.out.println(vipGuests.size()+regularGuests.size());
        if(!vipGuests.isEmpty()){
            for (String guest : vipGuests) {
                System.out.println(guest);
            }
        }
        if(!regularGuests.isEmpty()){
            for (String regularGuest : regularGuests) {
                System.out.println(regularGuest);

            }
        }
    }
}
