package behavioral.observer.topic;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();
        MemberA memberA = new MemberA(topic);
        MemberB memberB = new MemberB(topic);

        topic.add("Một");
        topic.add("Hai");
        topic.add("Ba");

        topic.update(new News(2, "Bốn"));
    }
}
