package WildFarm;

public class Zebra extends Mammal{
    public String getFoodType() {
        return foodType;
    }

    protected String foodType;
    protected Zebra(String animalType, String name, Double animalWeight, String livingRegion) {
        super(animalType, name, animalWeight, livingRegion);
        this.foodType="Vegetable";
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if(food instanceof Vegetable){
            super.eat(food);
        }else {
            System.out.println(" Zebras are not eating that type of food!");
        }

    }
}
