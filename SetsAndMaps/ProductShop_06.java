package Lab.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> shopList = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            if (!shopList.containsKey(shop)) {
                shopList.put(shop, new LinkedHashMap<>());
            }
            shopList.get(shop).put(product, price);
            input = scan.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Double>> mapEntry : shopList.entrySet()) {
            System.out.printf("%s->%n",mapEntry.getKey());
            for (Map.Entry<String, Double> nestedMap : mapEntry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",nestedMap.getKey(),nestedMap.getValue());

            }


        }
    }
}
