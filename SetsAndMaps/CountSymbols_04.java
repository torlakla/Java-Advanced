package Exercise.SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Character, Integer> countTable = new TreeMap<>();
       String input=scan.nextLine();
        for (int i = 0; i <input.length(); i++) {

            char currentSymbol =input.charAt(i);
            countTable.putIfAbsent(currentSymbol, 0);
            countTable.put(currentSymbol,countTable.get(currentSymbol)+1);
        }
        for (Map.Entry<Character, Integer> entry : countTable.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());

        }

    }


}
