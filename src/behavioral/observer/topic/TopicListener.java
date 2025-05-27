package behavioral.observer.topic;

public interface TopicListener {
    void updateListen(News n);
    void insertListen(News n);
}
