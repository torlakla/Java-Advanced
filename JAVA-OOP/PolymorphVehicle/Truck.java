package PolymorphEx_Vehicle;



public class Truck extends Vehicle {
    private static double EXTRA_FUEL_CONSUMPTION=1.6;
    public Truck(double fuelQuantity, double fuelConsumptionPerLiter,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerLiter+EXTRA_FUEL_CONSUMPTION,tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel*0.95);
    }
}
