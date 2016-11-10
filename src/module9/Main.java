package module9;

import module7.Currency;
import module7.Order;
import module7.User;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(123, "Andrii", "Luskov", "Lutsk", 1200);
        Order order1 = new Order(213, 150, Currency.UAH, "knife", "Fokstrot", user1);

        User user2 = new User(123, "Andrii", "Luskov", "Lutsk", 1200);
        Order order2 = new Order(213, 150, Currency.UAH, "knife", "Fokstrot", user2);

        User user3 = new User(75545, "Ivan", "Lichko", "Kiyv", 800);
        Order order3 = new Order(215, 300, Currency.USD, "mp3 player", "Comfy", user3);

        User user4 = new User(67544, "Evgen", "Baev", "Lviv", 7000);
        Order order4 = new Order(216, 2000, Currency.UAH, "jacket", "Moda", user4);

        User user5 = new User(213412, "Andrii", "Ziytin", "Kiyv", 22200);
        Order order5 = new Order(217, 18000, Currency.UAH, "computer", "Eldo", user5);

        User user6 = new User(67584, "Victor", "Datsiuk", "Lutsk", 6800);
        Order order6 = new Order(218, 2550, Currency.UAH, "chair", "IKEA", user6);

        User user7 = new User(232353, "Olga", "Vakulenko", "Lutsk", 200);
        Order order7 = new Order(219, 100, Currency.USD, "tour", "Tui", user7);

        User user8 = new User(5464334, "Iryna", "Krasko", "Lviv", 4300);
        Order order8 = new Order(220, 3600, Currency.UAH, "table", "IKEA", user8);

        User user9 = new User(675445, "Alla", "Lusenko", "Kiyv", 6800);
        Order order9 = new Order(220, 5000, Currency.UAH, "table", "Ahan", user9);

        User user10 = new User(987433, "Olga", "Petrov", "Lviv", 500);
        Order order10 = new Order(222, 330, Currency.USD, "coat", "Noda", user10);



        List<Order> list = new ArrayList<>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);


        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        list.forEach((Order) -> System.out.println(Order));//- sort list by Order price in decrease order

        Collections.sort(list, (o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            if (o1.getPrice() == o2.getPrice())
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            else {
                return 0;
            }
                }
        );

        list.forEach((Order) -> System.out.println(Order));//- sort list by Order price in increase order AND User city

        Collections.sort(list, (o1, o2) ->{
            int res1=o1.getItemName().compareTo(o2.getItemName());
            int res2=o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int res3=o1.getUser().getCity().compareTo(o2.getUser().getCity());

            if (res1!=0) return res1;
            if (res1== 0) return res2;
            if (res2==0) return res3;
            else return 0;
        });
        list.forEach((Order) -> System.out.println(Order));//- sort list by Order itemName AND ShopIdentificator AND User city

        List<Order> deleteDublicate = list.parallelStream().distinct().collect(Collectors.toList());
        deleteDublicate.forEach((Order) -> System.out.println(Order));//- delete duplicates from the list

        List<Order> deleteItemLittlePrice = list.stream().filter(o -> o.getPrice() > 1500).collect(Collectors.toList());
        deleteItemLittlePrice.forEach((Order) -> System.out.println(Order));//- delete items where price less than 1500

        List<Order> uah = list.stream().filter(o -> o.getCurrency() == Currency.UAH).collect(Collectors.toList());
        List<Order> usd = list.stream().filter(o -> o.getCurrency() == Currency.USD).collect(Collectors.toList());
        uah.forEach((Order) -> System.out.println(Order));
        usd.forEach((Order) -> System.out.println(Order));//- separate list for two list - orders in USD and UAH

        List<List<Order>> cities = new ArrayList<>();
        Map<String, List<Order>> uniquecity = list.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        uniquecity.forEach((o, orders) -> cities.add(orders));
        cities.forEach((Order) -> System.out.println(Order));//- separate list for as many lists as many unique cities are in User

        boolean checkPetrov = list.stream().anyMatch(order -> order.getUser().getLastName().contains("Petrov"));
        System.out.println(checkPetrov);//- check if set contain Order where User’s lastName is - “Petrov”

        list.removeIf(order -> order.getCurrency().equals(Currency.USD));
        System.out.println(list);//- delete orders where currency is USD

    }
}



