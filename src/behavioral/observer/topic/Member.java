package behavioral.observer.topic;

public abstract class Member implements TopicListener{
    private Topic topic;

    public Member(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }
}
