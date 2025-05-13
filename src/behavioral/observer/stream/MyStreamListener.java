package behavioral.observer.stream;

public interface MyStreamListener<T> {
    void listen(T t);
}
