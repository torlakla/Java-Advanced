package Lab.SetsAndMaps;

import java.util.*;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> numbers = new LinkedHashMap<>();
        for (double number : input) {
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            }else {
                numbers.put(number,numbers.get(number)+1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
