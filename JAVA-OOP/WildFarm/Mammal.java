package WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    public String getLivingRegion() {
        return livingRegion;
    }

    protected String livingRegion;

    protected Mammal(String animalType, String name, Double animalWeight, String livingRegion) {
        super(animalType, name, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    void eat(Food food) {
        this.foodEaten+=food.quantity;
    }
    public String toString(){
        DecimalFormat formetter= new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
                this.animalType,
                this.name,
                formetter.format(this.animalWeight),
                this.livingRegion,
                this.foodEaten);
    }
}

