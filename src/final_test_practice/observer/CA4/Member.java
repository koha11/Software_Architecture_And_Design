package final_test_practice.observer.CA4;

public abstract class Member implements TopicListener{
    protected String name;
    protected Topic topic;

    public Member(String name, Topic topic) {
        this.name = name;
        this.topic = topic;
        this.topic.attach(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void unRegister() {
        topic.detach(this);
        topic = null;
    }

    public void register(Topic topic) {
        this.topic = topic;
    }
}
