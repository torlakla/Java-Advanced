package Exercise.DefiningClasses.PokemonTrainer_06;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;


    public void checkPokemon(String input) {
        boolean isElementPresent = false;
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getElement().equals(input)) {
                isElementPresent = true;
                break;
            }
        }
        if (isElementPresent) {
            badges += 1;
        } else {
            for (int i = 0; i <pokemonList.size(); i++) {
                pokemonList.get(i).setHealth(pokemonList.get(i).getHealth() - 10);
                if (pokemonList.get(i).getHealth() <= 0) {
                    pokemonList.remove(pokemonList.get(i));

                }
            }
        }
    }

    public String toString() {
        return String.format("%s %d %d", name, badges, pokemonList.size());
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Trainer(String name, Pokemon pokemon) {
        pokemonList=new ArrayList<>();
        this.name = name;
        this.pokemonList.add(pokemon);
        this.badges = 0;
    }
}
