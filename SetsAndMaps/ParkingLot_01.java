package Lab.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        LinkedHashSet<String> parkingLot= new LinkedHashSet<>();

        while(!input.equals("END")){
            if(input.contains("IN")){
                parkingLot.add(input.split(" ")[1]);
            }else {
                parkingLot.remove(input.split(" ")[1]);
            }


            input=scan.nextLine();
        }
        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }


    }
}
