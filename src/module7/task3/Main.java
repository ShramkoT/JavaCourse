package module7.task3;

import module7.Currency;
import module7.Order;
import module7.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Order> Treeset = new TreeSet<>();
        User user1 = new User(123, "Andrii", "Luskov", "Lutsk", 1200);
        Order order1 =new Order(213, 150, Currency.UAH, "knife", "Fokstrot", user1 );

        User user2 = new User(23423, "Petro", "Chizik", "Lviv", 500);
        Order order2 =new Order(214, 300, Currency.USD, "fridge", "Fokstrot", user2 );

        User user3 = new User(75545, "Ivan", "Lichko", "Kiyv", 800);
        Order order3 =new Order(215, 250, Currency.USD, "mp3 player", "Comfy", user3 );

        User user4 = new User(67544, "Evgen", "Baev", "Lviv", 7000);
        Order order4 =new Order(216, 2000, Currency.UAH, "jacket", "Moda", user4 );

        User user5 = new User(213412, "Andrii", "Ziytin", "Kiyv", 22200);
        Order order5 =new Order(217, 18000, Currency.UAH, "computer", "Eldo", user5 );

        User user6 = new User(67584, "Victor", "Datsiuk", "Lutsk", 6800);
        Order order6 =new Order(218, 2550, Currency.UAH, "chair", "IKEA", user6 );

        User user7 = new User(232353, "Olga", "Vakulenko", "Lutsk", 200);
        Order order7 =new Order(219, 100, Currency.USD, "tour", "Tui", user7 );

        User user8 = new User(5464334, "Iryna", "Krasko", "Kyiv", 4300);
        Order order8 =new Order(220, 3600, Currency.UAH, "table", "IKEA", user8 );

        User userDupl = new User(5464334, "Nick", "Petrov", "Kyiv", 4200);
        Order order9 = new Order(222, 3300, Currency.UAH, "fork", "IDO", userDupl );
        Order order10 = new Order(222, 3300, Currency.UAH, "fork", "IDO", userDupl );

        Treeset.add(order1);
        Treeset.add(order2);
        Treeset.add(order3);
        Treeset.add(order4);
        Treeset.add(order5);
        Treeset.add(order6);
        Treeset.add(order7);
        Treeset.add(order8);
        Treeset.add(order9);
        Treeset.add(order10);

        System.out.println(checkUserName(Treeset, "Petrov") );
        System.out.println(Treeset.iterator().next());
        deletingUsersWithUsdCurrency(Treeset);
        System.out.println(Treeset);
    }

    public static boolean checkUserName(Set<Order> set, String lastName) {

        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getUser().getLastName().equals(lastName))
                return true;
        }
        return false;

    }

    private static void deletingUsersWithUsdCurrency(Set<Order> set) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        }
    }



}
