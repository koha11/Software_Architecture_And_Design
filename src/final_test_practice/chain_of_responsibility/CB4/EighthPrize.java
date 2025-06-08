package final_test_practice.chain_of_responsibility.CB4;

import java.util.List;

public class EighthPrize extends LotteryChecker{
    public EighthPrize(String prizeName, List<String> winningSet) {
        super(prizeName, winningSet);
    }

    @Override
    public String check(String lotteryNumber) {
        for(var number: winningSet)
            if(lotteryNumber.endsWith(number))            return "You are winning 8th prize";

            return "Good luck next time";
    }

    @Override
    public LotteryChecker setNextPrize(LotteryChecker lotteryPrize) {
        return null;
    }
}
