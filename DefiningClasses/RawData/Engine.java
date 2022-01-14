package Exercise.DefiningClasses.RawData_04;

public class Engine {
    int engineSpeed;
    int enginePower;

    public int getEnginePower() {
        return enginePower;
    }

    public Engine(int speed, int power){
        this.engineSpeed=speed;
        this.enginePower=power;
    }
}
