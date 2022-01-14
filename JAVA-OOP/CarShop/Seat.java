package CarShop;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        super(model, color, horsePower, country);
        this.price = price;

    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    public String toString() {
        return String.format("This is %s produced in %s and have %d tires%n" +
                "%s sells for %f",this.getModel(),this.countryProduced(),tires, this.getModel(), this.getPrice());
    }
}
