package ExamPrep.LootBox_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> firstLootBox;
        firstLootBox = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondLootBox= new ArrayDeque<>();
       Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
        .forEach(secondLootBox::push);

        int collection = 0;

        while (!firstLootBox.isEmpty() && !secondLootBox.isEmpty()) {
            int itemFirstBox = firstLootBox.peek();
            int itemSecondBox = secondLootBox.peek();
            if ((itemFirstBox + itemSecondBox) % 2 == 0) {
                collection += (itemFirstBox + itemSecondBox);
                firstLootBox.poll();
                secondLootBox.pop();
            } else {

                firstLootBox.offer(secondLootBox.pop());
            }
        }
        if (firstLootBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }
        if (collection >= 100) {
            System.out.println("Your loot was epic! Value: " + collection);
        } else {
            System.out.println("Your loot was poor... Value: " + collection);
        }


    }
}
