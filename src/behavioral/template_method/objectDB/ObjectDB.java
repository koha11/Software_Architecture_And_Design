package behavioral.template_method.objectDB;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    private List<T> list;

    public ObjectDB() {
        this.list = new ArrayList<>();
    }

    abstract public int getId(T t);
    public T findById(int id) {
        for (var t : list)
            if(getId(t) == id)
                return t;

        return null;
    }

    public ObjectDB<T> add(T t) {
        for (var e : list)
            if(getId(e) == getId(t))
                return this;

        list.add(t);

        return this;
    }

    public void update(T t) {
        for (int i = 0; i < list.size(); i++)
            if(getId(list.get(i)) == getId(t))
                list.set(i,t);
    }

    public void delete(T t) {
        for (int i = 0; i < list.size(); i++) {
            if(getId(list.get(i)) == getId(t))
                list.remove(t);
        }
    }
}
