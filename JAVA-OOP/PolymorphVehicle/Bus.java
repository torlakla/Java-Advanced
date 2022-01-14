package PolymorphEx_Vehicle;

public class Bus extends Vehicle{
    private static double FUEL_FULL_BUS=1.4;
    protected Bus(double fuelQuantity, double fuelConsumptionPerLiter,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerLiter+FUEL_FULL_BUS,tankCapacity);
    }
    public void driveEmpty(double distance){
        this.fuelConsumptionPerLiter-=FUEL_FULL_BUS;
        drive(distance);
        this.fuelConsumptionPerLiter+=FUEL_FULL_BUS;
    }
}
