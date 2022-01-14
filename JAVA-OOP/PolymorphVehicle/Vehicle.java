package PolymorphEx_Vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerLiter;
    protected double tankCapacity;


    protected Vehicle(double fuelQuantity, double fuelConsumptionPerLiter, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        this.fuelConsumptionPerLiter = fuelConsumptionPerLiter;
        this.tankCapacity = tankCapacity;


    }

    private void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity > 0) {
            this.fuelQuantity = fuelQuantity;
        } else {
            System.out.println("Fuel must be a positive number");
        }
    }

    public void drive(double distance) {
        if (distance * this.fuelConsumptionPerLiter > fuelQuantity) {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        } else {
            this.fuelQuantity -= (distance * this.fuelConsumptionPerLiter);
            DecimalFormat dm = new DecimalFormat("0.##");

            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), dm.format(distance));
        }
    }

    public void refuel(double fuel) {
        if (fuel <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (fuel + this.fuelQuantity > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity += (fuel);
        }

    }

    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }


    public void driveEmpty(double parseDouble){

    }
}
