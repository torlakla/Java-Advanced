package Lab.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;
    public Topping(String toppingType, double weight){
        setToppingType(toppingType);
        setWeight(weight);

    }

    private void setWeight(double weight) {
        if (weight<1 || weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.toppingType));
        }
        this.weight=weight;
    }

    private void setToppingType(String toppingType) {
        switch (toppingType){
            case"Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType=toppingType;
                break;
            default:
                throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",toppingType));
        }


    }

    public double calculateCalories(){
        double modifier=0;
        switch (this.toppingType){
            case "Meat":
                modifier=1.2;
                break;
            case "Veggies":
                modifier=0.8;
                break;
            case "Cheese":
                modifier=1.1;
                break;
            case "Sauce":
                modifier=0.9;
                break;
        }
        return (this.weight* 2.0)*modifier;

    }
}
