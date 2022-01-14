package ExamPrep.Bomb_Problem_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Bomb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> bombPouch = new TreeMap<>();
        bombPouch.put("Cherry Bombs", 0);
        bombPouch.put("Datura Bombs", 0);
        bombPouch.put("Smoke Decoy Bombs", 0);

        ArrayDeque<Integer> bombEffect =new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(bombEffect::add);

        ArrayDeque<Integer> bombCasing = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(bombCasing::push);
        boolean isFilled = false;
        while (!bombEffect.isEmpty() && !bombCasing.isEmpty() && !isFilled) {
            int effect = bombEffect.peek();
            int casing = bombCasing.peek();
            int value = effect + casing;
            if (value == 40) {
                bombPouch.put("Datura Bombs", bombPouch.get("Datura Bombs") + 1);
                bombEffect.poll();
                bombCasing.pop();
            } else if (value == 60) {
                bombPouch.put("Cherry Bombs", bombPouch.get("Cherry Bombs") + 1);
                bombEffect.poll();
                bombCasing.pop();
            } else if (value == 120) {
                bombPouch.put("Smoke Decoy Bombs", bombPouch.get("Smoke Decoy Bombs") + 1);
                bombEffect.poll();
                bombCasing.pop();
            } else {
                int lastVal = bombCasing.pop() - 5;
                bombCasing.push(lastVal);
            }
            int filledCounter = 0;
            for (Integer integer : bombPouch.values()) {
                if (integer >= 3) {
                    filledCounter++;
                }
            }
            if (filledCounter == 3) {
                isFilled = true;

            }

        }
        if (isFilled) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if (bombEffect.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            System.out.print("Bomb Effects: ");
            printDec(bombEffect);
            System.out.println();
        }
        if (bombCasing.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            System.out.print("Bomb Casings: ");
            printCasing(bombCasing);
            System.out.println();

        }
        bombPouch.entrySet().stream().forEach(entry ->
                System.out.println(entry.getKey() + ": " + entry.getValue()));


    }

    public static void printDec(ArrayDeque<Integer> dec) {
        while (!dec.isEmpty()) {
            if (dec.size() > 1) {
                System.out.print(dec.poll() + ", ");
            } else {
                System.out.print(dec.poll());
            }
        }
    }

    public static void printCasing(ArrayDeque<Integer> dec) {
        while (!dec.isEmpty()) {
            if (dec.size() > 1) {
                System.out.print(dec.pop() + ", ");
            } else {
                System.out.print(dec.pop());
            }
        }
    }
}
