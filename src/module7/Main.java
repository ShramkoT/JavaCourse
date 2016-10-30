package module7;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.swing.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        User user9 = new User(675445, "Alla", "Lusenko", "Kiyv", 6800);
        Order order9 =new Order(221, 5000, Currency.UAH, "boots", "Ahan", user9 );

        User user10 = new User(987433, "Olga", "Babych", "Lviv", 500);
        Order order10 =new Order(222, 330, Currency.USD, "coat", "Noda", user10 );




        ArrayList<Order> list = new ArrayList<Order>();
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

        System.out.println(list);
        sortByOrderDecrease(list);
        System.out.println(list);
        Collections.sort(list,sortByOrderIncrAndUserCity);
        System.out.println(list);
        Collections.sort(list,sortByItemAndShopIdAndUserCity);
        System.out.println(list);
        System.out.println(deleteDublicate(list));
        System.out.println(deleteItemLittlePrice(list));
        System.out.println("UAH - " + separateByCur(list)[0] + "\n" + "USD - " + separateByCur(list)[1]);
        System.out.println("Lviv - " + separateList(list)[0] + "\n" + "Lutsk - " +separateList(list)[1] + "\n" +
        "Kiyv - " + separateList(list)[2]);


    }
    public static void sortByOrderDecrease(List list){

        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }
    public static Comparator<Order> sortByOrderIncrAndUserCity = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
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
    };

    public static Comparator<Order> sortByItemAndShopIdAndUserCity = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            int res1=o1.getItemName().compareTo(o2.getItemName());
            int res2=o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int res3=o1.getUser().getCity().compareTo(o2.getUser().getCity());

            if (res1!=0) return res1;
            if (res1== 0) return res2;
            if (res2==0) return res3;
            else return 0;
        }
    };

    public static List deleteDublicate(List<Order>list){
        HashSet dubl =new HashSet(list);
        list.clear();
        list.addAll(dubl);
        return list;
    }

    public static List deleteItemLittlePrice(List<Order>list){
        for (int i =0; i<list.size(); i++) {
            if (list.get(i).getPrice() < 1500) list.remove(i);
        }
        return list;
    }

    public static List[] separateByCur(List<Order>list){
        List[] res = new ArrayList[2];
        List<Order> res1 = new ArrayList<>();
        List<Order> res2 = new ArrayList<>();

        for (Order o:list){
            if (o.getCurrency()==Currency.UAH) res1.add(o);
            if (o.getCurrency()==Currency.USD) res2.add(o);
        }

        res[0]=(List)res1;
        res[1]=(List)res2;
        return res;
    }

    public static List[] separateList(List<Order>list){

        HashSet<String> set = new HashSet<>();
        List<String> cities = new ArrayList<>();
        List[] res = new ArrayList[3];
        List<Order> res1 = new ArrayList<>();
        List<Order> res2 = new ArrayList<>();
        List<Order> res3 = new ArrayList<>();

        for (int i= 0;i<list.size(); i++){
            set.add(list.get(i).getUser().getCity());
        }

        for (String item:set){
            cities.add(item);
        }

        for (Order o:list){
            if (o.getUser().getCity()==cities.get(0)) res1.add(o);
            if (o.getUser().getCity()==cities.get(1)) res2.add(o);
            if (o.getUser().getCity()==cities.get(2)) res3.add(o);
        }

        res[0]=res1;
        res[1]=res2;
        res[2]=res3;

        return res;
    }
}
