package final_test_practice.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TopicListener> listeners;
    List<News> newsList;

    public Topic() {
        this.listeners = new ArrayList<>();
        this.newsList = new ArrayList<>();
    }

    public void attach(TopicListener listener) {
        listeners.add(listener);
    }

    public void detach(TopicListener listener) {
        listeners.remove(listener);
    }

    public void createNews(String content) {
        News n = new News(newsList.size() + 1, content);
        newsList.add(n);
        for(var listener: listeners)
            listener.listenAddNews(n);
    }

    public void updateNews(int id, String newContent) {
        for(var news: newsList)
            if(news.getId() == id)
            {
                news.setContent(newContent);
                for(var listener: listeners)
                    listener.listenUpdateNews(news);
                break;
            }
    }
}
