package Exercise.DefiningClasses.PokemonTrainer_06;

public class Pokemon {
    private String pokemonName;
    private String element;
    private int health;

    public String getElement() {
        return element;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Pokemon(String pokemonName, String element, int health){
        this.pokemonName=pokemonName;
        this.element=element;
        this.health=health;
    }
}
