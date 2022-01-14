package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;
    public PriceCalculator(double pricePerDay,int numberOfDays,Season season, DiscountType discountType){
        this.pricePerDay=pricePerDay;
        this.numberOfDays=numberOfDays;
        this.season=season;
        this.discountType=discountType;
    }
    public double calculate(){
        double result=0;
        result= pricePerDay* numberOfDays*season.getMultiplier()*(1- discountType.getPercentage());
        return result;
    }

}
