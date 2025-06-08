package final_test_practice.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class MemberB extends Member{
    private List<News> newsList;
    public MemberB(String name, Topic topic) {
        super(name, topic);
        newsList = new ArrayList<>();
    }

    @Override
    public void listenAddNews(News n) {
        newsList.add(n);
        System.out.println("Member " + name + ": ");
        for(var news: newsList)
            System.out.println(news.toString());

        System.out.println();
    }

    @Override
    public void listenUpdateNews(News n) {
        System.out.println("Member " + name + ": ");
        for(var news: newsList)
            if(news.getId() == n.getId())
            {
                news.setContent(n.getContent());
                System.out.println(news);
            }
        System.out.println();
    }
}
