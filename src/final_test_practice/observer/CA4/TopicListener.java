package final_test_practice.observer.CA4;

public interface TopicListener {
    void listenAddNews(News n);

    void listenUpdateNews(News n);
}
