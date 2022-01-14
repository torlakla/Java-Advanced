package WildFarm;

public class Cat extends Feline{

    protected String foodType;
    private String breed;
    protected Cat(String animalType, String name, Double animalWeight, String livingRegion,String breed) {
        super(animalType, name, animalWeight, livingRegion);
        this.breed=breed;
        this.foodType="Vegetable, Meat";
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        super.eat(food);

    }
    public String toString(){
        StringBuilder sb= new StringBuilder(super.toString());
        sb.insert(sb.indexOf(",") +2,this.breed+ ", ");
        return sb.toString();
    }
}
