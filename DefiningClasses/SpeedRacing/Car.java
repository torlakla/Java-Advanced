package Exercise.DefiningClasses.SpeedRacing_03;

public class Car {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostForKM() {
        return fuelCostForKM;
    }

    public void setFuelCostForKM(double fuelCostForKM) {
        this.fuelCostForKM = fuelCostForKM;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    //Model, fuel amount, fuel cost for 1 kilometer and distance traveled
    private String model;
    private double fuelAmount;
    private double fuelCostForKM;
    private double distanceTravelled=0;

    public Car(String model, double fuelAmount, double fuelCostForKM) {
        this.model=model;
        this.fuelAmount=fuelAmount;
        this.fuelCostForKM=fuelCostForKM;
        this.distanceTravelled=0;
    }
    public boolean canMove(double km, Car car){
        if (car.fuelAmount>= car.fuelCostForKM*km){
            distanceTravelled+=km;
            fuelAmount=fuelAmount-(fuelCostForKM*km);
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        return String.format("%s %.2f %.0f",this.model,this.fuelAmount,this.distanceTravelled);
    }
}
