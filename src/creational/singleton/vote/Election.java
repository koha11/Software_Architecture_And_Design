package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int countTrumpVote, countBidenVote;
    private List<String> votedUsers;
    private Election() {
        countTrumpVote = 0;
        countBidenVote = 0;
        votedUsers = new ArrayList<>();
    }

    public static Election getInstance(){
        if(instance == null)
            instance = new Election();

        return instance;
    }

    public void inKQ(){
        System.out.println("Trump's votes: " + countTrumpVote);
        System.out.println("Biden's votes: " + countBidenVote);
    }

    public void vote(Candidate c, String name) {
        if (votedUsers.contains(name))
        {
            System.out.println(name + " da vote roi !!");
            return;
        }
        else
            votedUsers.add(name);

        System.out.println(name + " vote cho " + c);

        if (c == Candidate.TRUMP)
            countTrumpVote++;
        if (c == Candidate.BIDEN)
            countBidenVote++;
    }
}
