package module8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractDAOImpl absDaoImpl = new AbstractDAOImpl();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);

        absDaoImpl.save(list);
        absDaoImpl.delete(list);
        absDaoImpl.deleteAll(list);
        absDaoImpl.saveAll(list);
        absDaoImpl.getList();
    }
}
