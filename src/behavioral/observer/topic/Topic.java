package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private int count = 0;
    private List<News> newsList;
    private List<TopicListener> listeners;

    public Topic() {
        newsList = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public void attach(TopicListener member) {
        listeners.add(member);
    }
    public void detach(TopicListener member) {
        listeners.remove(member);
    }
    public void add(String content) {
        News news = new News(++count, content);
        newsList.add(news);

        for(var listener: listeners)
            listener.insertListen(news);
    }
    public void update(News news) {
        for(var n: newsList) {
            if (n.getId() == news.getId())
                n.setContent(news.getContent());
        }

        for(var listener: listeners)
            listener.updateListen(news);
    }


}
