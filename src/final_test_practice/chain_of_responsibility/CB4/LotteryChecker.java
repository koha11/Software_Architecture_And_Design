package final_test_practice.chain_of_responsibility.CB4;

import java.util.List;

public abstract class LotteryChecker {
    protected String prizeName;
    protected List<String> winningSet;

    public LotteryChecker(String prizeName, List<String> winningSet) {
        this.prizeName = prizeName;
        this.winningSet = winningSet;
    }

    public abstract String check(String lotteryNumber);

    public abstract LotteryChecker setNextPrize(LotteryChecker lotteryPrize);
}
