package Exercise.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUserNames_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> usernames=new LinkedHashSet<>();
            int n=Integer.parseInt(scan.nextLine());
        for (int i =0; i <n; i++) {
            String input=scan.nextLine();
            usernames.add(input);

        }
        for (String username : usernames) {
            System.out.println(username);

        }
    }
}
