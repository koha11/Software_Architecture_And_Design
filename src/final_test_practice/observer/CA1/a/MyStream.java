package final_test_practice.observer.CA1.a;

public class MyStream<T>{
    private MyStreamListener<T> listener;

    public MyStream() {
        listener = null;
    }

    public void addEvent(T t) {
        listener.listen(t);
    }

    public void addListener(MyStreamListener<T> listener) {
        this.listener = listener;
    }

    public void removeListener() {
        listener = null;
    }
}
