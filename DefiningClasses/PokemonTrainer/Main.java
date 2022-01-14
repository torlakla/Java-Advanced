package Exercise.DefiningClasses.PokemonTrainer_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Trainer> list = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            if(list.containsKey(name)) {
                list.get(name).getPokemonList().add(pokemon);


            } else {
                Trainer trainer= new Trainer(name,pokemon);
                list.put(name, trainer);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            for (Trainer trainer : list.values()) {
                trainer.checkPokemon(input);


            }
            input = scan.nextLine();
        }
        list.entrySet().stream()
                .sorted((first,second)->second.getValue().getBadges() - first.getValue().getBadges())
                .forEach(stringTrainerEntry -> System.out.println(stringTrainerEntry.getValue()));


    }
}
