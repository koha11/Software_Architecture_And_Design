package final_test_practice.observer.CA4;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();
        MemberA memberA = new MemberA("A", topic);
        MemberB memberB = new MemberB("B", topic);

        topic.createNews("Hello ae");
        topic.createNews("mot gio 10 lam ae a");
        topic.updateNews(1,"Hello ae lan 2");
        topic.createNews("Hello ae lan 3");
    }
}
