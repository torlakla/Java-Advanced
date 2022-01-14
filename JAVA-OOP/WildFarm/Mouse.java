package WildFarm;

public class Mouse extends Mammal{

    protected Mouse(String animalType, String name, Double animalWeight, String livingRegion) {
        super(animalType, name, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if(food instanceof Vegetable){
            super.eat(food);
        }else {
            System.out.println(" Mice are not eating that type of food!");
        }

    }
}
