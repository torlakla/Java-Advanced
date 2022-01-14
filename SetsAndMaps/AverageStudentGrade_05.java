package Lab.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentGrade_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        TreeMap<String,List<Double>> students= new TreeMap<>();
        for (int i = 0; i <n; i++) {
            String[] input= scan.nextLine().split("\\s+");
            String name=input[0];
            double grade =Double.parseDouble(input[1]);

            if(!students.containsKey(name)){
                students.put(name,new ArrayList<>());
                students.get(name).add(grade);
            }else {
                students.get(name).add(grade);
            }
        }


        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey()+ " -> ");
            double avgGrade=0.0;
            for (double value : entry.getValue()) {
                System.out.printf("%.2f ",value);
                avgGrade+=value;
            }
            avgGrade=avgGrade/entry.getValue().size();
            System.out.printf("(avg: %.2f)",avgGrade);
            System.out.println();

        }

    }
}
