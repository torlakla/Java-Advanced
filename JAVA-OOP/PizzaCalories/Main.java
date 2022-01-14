package Lab.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputPizza = scan.nextLine().split("\\s+");
        Pizza pizza = null;
        Dough dough = null;
        Topping topping = null;
        try {
            pizza = new Pizza(inputPizza[1], Integer.parseInt(inputPizza[2]));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        inputPizza = scan.nextLine().split("\\s+");
        try {
            dough = new Dough(inputPizza[1], inputPizza[2], Integer.parseInt(inputPizza[3]));
            pizza.setDough(dough);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        String input = scan.nextLine();
        while (!input.equals("END")) {
            inputPizza = input.split("\\s+");
            try {
                topping = new Topping(inputPizza[1], Integer.parseInt(inputPizza[2]));
                pizza.addTopping(topping);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                return;
            }

            input = scan.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());


    }
}
