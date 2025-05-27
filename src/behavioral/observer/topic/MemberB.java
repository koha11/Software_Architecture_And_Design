package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class MemberB extends Member{
    private List<News> newsList;

    public MemberB(Topic topic) {
        super(topic);
        newsList = new ArrayList<>();

    }

    @Override
    public void updateListen(News news) {
        for(var n: newsList) {
            if (n.getId() == news.getId())
                n.setContent(news.getContent());
        }
        System.out.println(newsList);
    }

    @Override
    public void insertListen(News n) {
        newsList.add(n);
        System.out.println(newsList);
    }
}
