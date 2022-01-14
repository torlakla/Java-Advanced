package Exercise.DefiningClasses.Google_07;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Person> personsMap = new HashMap<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            String personName = commands[0];
            String pickClass = commands[1];
            String subClassName = commands[2];
            if (!personsMap.containsKey(personName)) {
                Person person = new Person(personName);
                personsMap.put(personName, person);
            }
            switch (pickClass) {
                case "company":
                    String department = commands[3];
                    double salary = Double.parseDouble(commands[4]);
                    Company company = new Company(subClassName, department, salary);
                    personsMap.get(personName).setCompany(company);
                    break;
                case "car":
                    int carSpeed = Integer.parseInt(commands[3]);
                    Car car = new Car(subClassName, carSpeed);
                    personsMap.get(personName).setCar(car);
                    break;
                case "pokemon":
                    String pokemonType = commands[3];
                    Pokemon pokemon = new Pokemon(subClassName, pokemonType);
                    personsMap.get(personName).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    String birthday = commands[3];
                    Parent parent = new Parent(subClassName, birthday);
                    personsMap.get(personName).getParentList().add(parent);
                    break;
                case "children":
                    String birthdayChild = commands[3];
                    Child child = new Child(subClassName, birthdayChild);
                    personsMap.get(personName).getChildList().add(child);
                    break;

            }


            input = scan.nextLine();
        }
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("Company:");
        if (personsMap.get(name).getCompany() != null) {
            System.out.println(personsMap.get(name).getCompany());
        }
        System.out.println("Car:");
        if (personsMap.get(name).getCar() != null) {
            System.out.println(personsMap.get(name).getCar());
        }
        System.out.println("Pokemon:");
        personsMap.get(name).getPokemonList().forEach(pokemon -> System.out.println(pokemon));
        System.out.println("Parents:");
        personsMap.get(name).getParentList().forEach(parent -> System.out.println(parent));
        System.out.println("Children:");
        personsMap.get(name).getChildList().forEach(child -> System.out.println(child));


    }
}
