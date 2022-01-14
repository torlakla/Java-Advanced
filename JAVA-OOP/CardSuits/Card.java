package CardSuits;

public class Card {
    private CardPower cardPower;
    private Suits suit;
    private int cardPowerTotal;

    public Card(String power, String suit){
        this.cardPower=CardPower.valueOf(power);
        this.suit= Suits.valueOf(suit);
    }

    public void setCardPowerTotal(){
        this.cardPowerTotal=this.cardPower.getCardValue()+this.suit.getSuitValue();
    }
    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",cardPower.name(),suit.name(),cardPowerTotal);
    }
}
