package Lab.SetsAndMaps;

import java.io.OutputStream;
import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> globe = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];
            if (!globe.containsKey(continent)) {
                globe.put(continent, new LinkedHashMap<>());
                globe.get(continent).put(country, new ArrayList<>());
                globe.get(continent).get(country).add(city);
            } else {
                if (!globe.get(continent).containsKey(country)) {
                    globe.get(continent).put(country, new ArrayList<>());
                    globe.get(continent).get(country).add(city);

                } else {
                    globe.get(continent).get(country).add(city);
                }
            }
        }


        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> stringLinkedHashMapEntry : globe.entrySet()) {
            System.out.printf("%s:%n", stringLinkedHashMapEntry.getKey());
            for (Map.Entry<String, ArrayList<String>> nestedMapEntry : stringLinkedHashMapEntry.getValue().entrySet()) {
                System.out.printf("  %s -> ", nestedMapEntry.getKey());
                String output = String.join(", ", nestedMapEntry.getValue());
                System.out.println(output);
            }

        }

    }
}


