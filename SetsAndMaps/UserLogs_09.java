package Exercise.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String ip = tokens[0].substring(3);
            String user = tokens[2].substring(5);

            if (!userLogs.containsKey(user)) {
                userLogs.put(user, new LinkedHashMap<>());
                userLogs.get(user).put(ip, 1);
            } else {
                if (!userLogs.get(user).containsKey(ip)) {
                    userLogs.get(user).put(ip, 1);
                } else {
                    userLogs.get(user).put(ip, userLogs.get(user).get(ip) + 1);
                }
            }

            input = scan.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : userLogs.entrySet()) {
            System.out.println(entry.getKey() + ":");
            int counter = entry.getValue().size();
            for (Map.Entry<String, Integer> innerEntry : entry.getValue().entrySet()) {
                if (counter > 1) {
                    System.out.print(innerEntry.getKey() + " => " + innerEntry.getValue() + ", ");
                    counter--;
                } else {
                    System.out.print(innerEntry.getKey() + " => " + innerEntry.getValue() + ".");
                }

            }
                System.out.println();

        }
    }
}