package final_test_practice.chain_of_responsibility.CB4;

import java.util.List;

public class LotteryPrize extends LotteryChecker{
    private LotteryChecker nextPrize;

    public LotteryPrize(String prizeName, List<String> winningSet) {
        super(prizeName, winningSet);
        nextPrize = null;
    }

    @Override
    public String check(String lotteryNumber) {
        for(var number: winningSet)
            if(lotteryNumber.endsWith(number))return "You are winning " + prizeName;

        return nextPrize.check(lotteryNumber);
    }

    @Override
    public LotteryChecker setNextPrize(LotteryChecker lotteryPrize) {
        nextPrize = lotteryPrize;
        return nextPrize;
    }
}
