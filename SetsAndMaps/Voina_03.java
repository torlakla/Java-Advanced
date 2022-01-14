package Lab.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> playerOneDeck = readHashSet(scan);
        LinkedHashSet<Integer> playerTwoDeck = readHashSet(scan);

        for (int i = 0; i < 50; i++) {

            int firstPlayerCard = playerOneDeck.iterator().next();
            playerOneDeck.remove(firstPlayerCard);


            int secondPlayerCard = playerTwoDeck.iterator().next();
            playerTwoDeck.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                playerOneDeck.add(firstPlayerCard);
                playerOneDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                playerTwoDeck.add(firstPlayerCard);
                playerTwoDeck.add(secondPlayerCard);
            }
            if(playerOneDeck.isEmpty() || playerTwoDeck.isEmpty()){
                break;
            }

        }
        if (playerOneDeck.size() > playerTwoDeck.size()) {
            System.out.println("First player win!");
        } else if (playerOneDeck.size() < playerTwoDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static LinkedHashSet<Integer> readHashSet(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
