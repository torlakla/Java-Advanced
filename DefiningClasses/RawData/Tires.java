package Exercise.DefiningClasses.RawData_04;

import java.util.List;

public class Tires {
    private List<Double> pressure;
    private List<Integer> age;

    public List<Double> getPressure() {
        return pressure;
    }

    public List<Integer> getAge() {
        return age;
    }

    public Tires(List<Double> pressure, List<Integer> age) {
        this.pressure = pressure;
        this.age = age;

    }

    public double getLowestPressure() {
        double min = pressure.stream().min(Double::compareTo).orElse(0.0);
        return min;
    }


}
