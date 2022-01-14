package HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split(" ");
        double pricePerDay=Double.parseDouble(input[0]);
        int days=Integer.parseInt(input[1]);
        Season season= Season.valueOf(input[2].toUpperCase(Locale.ROOT));
        String discount="";
        switch (input[3]){
            case "VIP":
                discount="VIP";
                break;
            case "SecondVisit":
                discount="SECOND_VISIT";
                break;
            case "None":
                discount="NONE";
                break;

        }
        DiscountType discountType= DiscountType.valueOf(discount);
        PriceCalculator calculator=new PriceCalculator(pricePerDay,days,season,discountType);
        System.out.printf("%.2f",calculator.calculate());
    }
}
