package Exercise.DefiningClasses.SpeedRacing_03;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Car> list = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCostPerKM = Double.parseDouble(input[2]);
            Car car = new Car(model, fuelAmount, fuelCostPerKM);
            list.put(model, car);
        }
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            String model = command[1];
            double kmToDrive = Double.parseDouble(command[2]);
            Car currentCar = list.get(model);
            if (!currentCar.canMove(kmToDrive, currentCar)) {
                System.out.println("Insufficient fuel for the drive");
            }
            input = scan.nextLine();


        }
        for (Car value : list.values()) {
            System.out.println(value);

        };
    }
}
