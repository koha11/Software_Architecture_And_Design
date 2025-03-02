package creational.singleton.vote;

public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;

    public void vote(Candidate c) {
        Election.getInstance().vote(c,name);
    }
}
