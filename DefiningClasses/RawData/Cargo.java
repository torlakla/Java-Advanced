package Exercise.DefiningClasses.RawData_04;

public class Cargo {
    private String cargoType;
    private int cargoWeight;

    public Cargo(String cargoType,int cargoWeight){
        this.cargoType=cargoType;
        this.cargoWeight=cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}
