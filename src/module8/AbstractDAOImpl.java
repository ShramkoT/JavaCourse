package module8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> list = new ArrayList<T>();
    @Override
    public T save(T t) {
        System.out.println("save - " + t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
        System.out.println("remove - " + t);
    }

    @Override
    public void deleteAll(List T) {
        list.removeAll(T);
        System.out.println("remove all - " + T);
    }

    @Override
    public void saveAll(List T) {
        System.out.println("save all - " + T);
    }

    @Override
    public List<T> getList() {
        return list;
    }
}
