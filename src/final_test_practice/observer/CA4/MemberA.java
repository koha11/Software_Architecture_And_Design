package final_test_practice.observer.CA4;

public class MemberA extends Member{
    public MemberA(String name, Topic topic) {
        super(name, topic);
    }

    @Override
    public void listenAddNews(News n) {
        System.out.println("Member " + name + ":\n" + n.getContent() + "\n");
    }

    @Override
    public void listenUpdateNews(News n) {
        System.out.println("Member " + name + ":\n" + n.getContent() + "\n");
    }
}
