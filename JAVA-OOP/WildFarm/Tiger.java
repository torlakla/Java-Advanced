package WildFarm;

public class Tiger extends Feline{

    protected String foodType;
    protected Tiger(String animalType, String name, Double animalWeight, String livingRegion) {
        super(animalType, name, animalWeight, livingRegion);
        this.foodType="Meat";
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    void eat(Food food) {
        if(food instanceof Meat){
            super.eat(food);
        }else {
            System.out.println("Tigers are not eating that type of food!");
        }

    }
}
