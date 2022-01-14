package Exercise.DefiningClasses.OpinionPoll_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            list.add(person);
        }
        // treemap
        // list.values().stream().filter(person -> person.getAge()>30).forEach(person -> System.out.println(person));
        // below they are sorted in aplhabetical order (can put .reversed() to make it reverse order.
        list.sort(Comparator.comparing(Person::getName));

        list.stream().filter(person -> person.getAge()>30).forEach(System.out::println);

    }
}
