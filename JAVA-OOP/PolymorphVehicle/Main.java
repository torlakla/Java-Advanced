package PolymorphEx_Vehicle;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        String[] input = scan.nextLine().split("\\s+");
        vehicleMap.put("Car", new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3])));
        input = scan.nextLine().split("\\s+");
        vehicleMap.put("Truck", new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3])));
        input = scan.nextLine().split("\\s+");
        vehicleMap.put("Bus", new Bus(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3])));
        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String[] commands = scan.nextLine().split("\\s+");
            if (commands[0].equals("Drive")) {
                vehicleMap.get(commands[1]).drive(Double.parseDouble(commands[2]));
            } else if (commands[0].equals("DriveEmpty")) {
                vehicleMap.get(commands[1]).driveEmpty(Double.parseDouble(commands[2]));
            } else if (commands[0].equals("Refuel")) {
                vehicleMap.get(commands[1]).refuel(Double.parseDouble(commands[2]));
            }
        }
        for (Vehicle value : vehicleMap.values()) {
            System.out.println(value);

        }
    }
}
