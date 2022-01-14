package WildFarm;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] animalInfo = input.split("\\s+");
            String[] foodInfo = scan.nextLine().split("\\s+");
            if (animalInfo.length == 5) {
                animalList.add(new Cat(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]));
            }else{
                switch (animalInfo[0]){
                    case "Mouse":
                        animalList.add(new Mouse(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]));
                        break;
                    case "Zebra":
                        animalList.add(new Zebra(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]));
                        break;
                    case "Tiger":
                        animalList.add(new Tiger(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]));
                        break;
                }
            }
            Food food;
            if(foodInfo[0].equals("Vegetable")){
               food= new Vegetable(Integer.parseInt(foodInfo[1]));
            }else {
               food= new Meat(Integer.parseInt(foodInfo[1]));
            }
            Animal animal= animalList.get(animalList.size()-1);
            animal.makeSound();
            animal.eat(food);


            input = scan.nextLine();
        }
        for (Animal animal : animalList) {
            System.out.println(animal);

        }
    }
}
