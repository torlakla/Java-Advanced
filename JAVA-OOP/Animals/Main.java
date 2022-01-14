package animals;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("Beast!")) {
            String[] data = scan.nextLine().split("\\s+");
            if (data.length < 3) {
                System.out.println("Invalid input!");
                continue;
            }
            try {
                switch (input) {
                    case "Dog":
                        Dog dog = new Dog(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(dog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(data[0], Integer.parseInt(data[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(data[0], Integer.parseInt(data[1]));
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            input = scan.nextLine();
        }
    }
}
