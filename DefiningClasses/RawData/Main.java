package Exercise.DefiningClasses.RawData_04;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Car> list = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            //"<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure>
            // <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>
            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(input[4], Integer.parseInt(input[3]));
            List<Double> pressureList = new ArrayList<>();
            pressureList.add(Double.parseDouble(input[5]));
            pressureList.add(Double.parseDouble(input[7]));
            pressureList.add(Double.parseDouble(input[9]));
            pressureList.add(Double.parseDouble(input[11]));
            List<Integer> ageList = new ArrayList<>();
            ageList.add(Integer.parseInt(input[6]));
            ageList.add(Integer.parseInt(input[8]));
            ageList.add(Integer.parseInt(input[10]));
            ageList.add(Integer.parseInt(input[12]));
            Tires tires = new Tires(pressureList, ageList);
            Car car = new Car(model, engine, cargo, tires);
            list.put(model, car);
        }

        String command = scan.nextLine();
        if (command.equals("fragile")) {
            list.values().stream()
                    .filter(car -> car.getCargo().getCargoType().equals(command))
                    .filter(car -> car.getTires().getLowestPressure() < 1)
                    .forEach(car -> System.out.println(car));
        } else {
            list.values().stream()
                    .filter(car -> car.getCargo().getCargoType().equals(command))
                    .filter(car -> car.getEngine().getEnginePower() > 250)
                    .forEach(car -> System.out.println(car));
        }
    }
}

