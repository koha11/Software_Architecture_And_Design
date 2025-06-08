package final_test_practice.observer.CA1.b;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T>{
    private List<MyStreamListener<T>> listeners;

    public MyStream() {
        listeners = new ArrayList<>();
    }

    public void addEvent(T t) {
        for(var listener: listeners)
            listener.listen(t);
    }

    public void addListener(MyStreamListener<T> listener) {
        listeners.add(listener);
    }

    public void removeListener(MyStreamListener<T> listener) {

    }
}
