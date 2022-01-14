package Exercise.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input= Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n=input[0];
        int m= input[1];
        LinkedHashSet<Integer> nSet= readSet(scan,n);
        LinkedHashSet<Integer> mSet= readSet(scan,m);
//        nSet.retainAll(mSet);
//        nSet.forEach(e-> System.out.print(e+ " "));
        // retainAll -> nSet only keeps elements that are present in mSet also. The rest are removed.

        for (Integer numberN : nSet) {
            for (Integer numberM : mSet) {
                if(numberN.equals(numberM)){
                    System.out.print(numberN+ " ");
                }
            }
        }
    }

    private static LinkedHashSet<Integer> readSet(Scanner scan, int number) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i <number; i++) {
            int input=Integer.parseInt(scan.nextLine());
            set.add(input);
        }
        return set;

    }
}
