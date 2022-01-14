package WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    protected String animalType;
    protected String name;
    protected Double animalWeight;
    protected Integer foodEaten;
    protected Animal(String animalType,String name,Double animalWeight){
        this.animalType=animalType;
        this.name=name;
        this.animalWeight=animalWeight;
        this.foodEaten=0;
    }


    abstract void makeSound();
    abstract void eat(Food food);
}
