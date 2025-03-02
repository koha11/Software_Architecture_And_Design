package creational.singleton.vote;

import java.util.Set;

public class MainA4 {
    public static void main(String[] args) {
        User us1 = new User("Khoa");
        User us2 = new User("Vinh");
        User us3 = new User("Trung");

        us1.vote(Candidate.TRUMP);
        us2.vote(Candidate.BIDEN);
        us3.vote(Candidate.TRUMP);
        us3.vote(Candidate.BIDEN);

        System.out.println("Result: ");
        Election.getInstance().inKQ();
    }
}
