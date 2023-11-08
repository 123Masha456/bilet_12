import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", 54);
        User user2 = new User("Nick", 23);
        User user3 = new User("Olga", 23);
        User user4 = new User("Petr", 61);
        User user5 = new User("Gregory", 39);
        User user6 = new User("Ivan", 54);
        User user7 = new User("Nick", 45);


        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);

        var distinct = users.stream().distinct().collect(Collectors.toList());

        System.out.println(distinct);
        System.out.println("\n");


        var sortedByName = distinct.stream()
                .sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());

        System.out.println(sortedByName);
        System.out.println("\n");

        var sortedByAge = distinct.stream()
                .sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());

        System.out.println(sortedByAge);
        System.out.println("\n");


        var theOldestPerson = distinct.stream().max(Comparator.comparingInt(User::getAge)).get();

        System.out.println(theOldestPerson);













    }
}