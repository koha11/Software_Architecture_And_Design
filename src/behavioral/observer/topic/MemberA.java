package behavioral.observer.topic;

public class MemberA extends Member{
    public MemberA(Topic topic) {
        super(topic);
    }

    @Override
    public void updateListen(News n) {
        System.out.println(n);
    }

    @Override
    public void insertListen(News n) {
        System.out.println(n);
    }
}
