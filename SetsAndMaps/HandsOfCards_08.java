package Exercise.SetsAndMaps;

import java.util.*;

public class HandsOfCards_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, HashSet<String>> playerDecks= new LinkedHashMap<>();

        String input=scan.nextLine();
        while(!input.equals("JOKER")){

            String playerName=input.split(":")[0];
            String cardInput=input.split(": ")[1];
            String[] cards=cardInput.split(", ");
            playerDecks.putIfAbsent(playerName,new HashSet<String>());
            for (int i = 0; i < cards.length; i++) {
                playerDecks.get(playerName).add(cards[i]);
            }
            input=scan.nextLine();
        }
        getCardPower(playerDecks);
    }
    private static Map<Character, Integer> getPointsValues() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;

    }

    private static int getCardPower(LinkedHashMap<String,HashSet<String>> deck) {
        for (Map.Entry<String, HashSet<String>> entry : deck.entrySet()) {
            String Name=entry.getKey();
             HashSet<String> elements=entry.getValue();
             int points=0;
             int playerStreigth=0;

            for (String element : elements) {
                String currentCard=element;
                if(currentCard.contains("10")){



                }

            }

        }



        return 0;
    }
}
