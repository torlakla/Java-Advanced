package Lab.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;
    public Pizza(String name, int numberOfToppings){
        setToppings(numberOfToppings);
        setName(name);
    }

    private void setName(String name) {
        if(name.trim().isEmpty() || name.length()>15){
            throw new IllegalArgumentException("Lab.PizzaCalories.Pizza name should be between 1 and 15 symbols.");
        }
        this.name=name;
    }

    private void setToppings(int toppings) {
        if(toppings<0 || toppings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings=new ArrayList<>(toppings);
    }

    public void setDough(Dough dought){
        this.dought=dought;

    }
    public String getName(){
        return this.name;
    }
    public void addTopping(Topping topping){
        this.toppings.add(topping);

    }
    public double getOverallCalories (){
//      double  totalCalories=0;
//      totalCalories+= this.dought.calculateCalories();
//        for (Lab.PizzaCalories.Topping topping : toppings) {
//            totalCalories+= topping.calculateCalories();
//        }
//        return totalCalories;
        return dought.calculateCalories()+ toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
