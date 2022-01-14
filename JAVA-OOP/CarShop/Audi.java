package CarShop;


public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;


    public Audi(String model, String color, Integer horsePower, String country, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay=minRentDay;
        this.pricePerDay=pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }
    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires%n" +
                "Minimum rental period of %d days. Price per day %f",this.getModel(),this.countryProduced(),tires,this.getMinRentDay(),this.getPriceDay());
    }

    @Override
    public Double getPriceDay() {
        return this.pricePerDay;
    }
}
