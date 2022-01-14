package CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String card=scan.nextLine();
        String power=scan.nextLine();
       Card newCard=new Card(card,power);
       newCard.setCardPowerTotal();

        System.out.println(newCard);


    }
}
