package PolymorphEx_Vehicle;
public class Car extends Vehicle {
    private  static double EXTRA_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+EXTRA_FUEL_CONSUMPTION,tankCapacity);
    }
}
