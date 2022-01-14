package Exercise.Generics.CustomList_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String data = scan.nextLine();


        while (!data.equals("END")) {
            String[] input = data.split(" ");
            String command = input[0];
            switch (command) {
                case "Add":
                    customList.add(input[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(input[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(input[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(input[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String el:customList){
                        System.out.println(el);
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }
            data = scan.nextLine();
        }

    }
}
