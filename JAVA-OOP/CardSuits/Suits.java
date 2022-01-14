package CardSuits;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int suitValue;

    Suits(int suitValue) {
        this.suitValue = suitValue;
    }
    public int getSuitValue(){
        return this.suitValue;
    }
}
