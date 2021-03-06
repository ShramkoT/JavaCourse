package module7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Order implements Comparator<Order> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compare(Order o1, Order o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
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
