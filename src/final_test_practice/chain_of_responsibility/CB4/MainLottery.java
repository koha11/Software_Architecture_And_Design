package final_test_practice.chain_of_responsibility.CB4;

import java.util.List;

public class MainLottery {
    public static void main(String[] args) {
        LotteryChecker firstPrize = new LotteryPrize("1st prize", List.of("111001"));

        LotteryChecker secondPrize = new LotteryPrize("2st prize", List.of("111001"));

        LotteryChecker thirdPrize = new LotteryPrize("3st prize", List.of("111001"));

        LotteryChecker eighthPrize = new EighthPrize("8th prize", List.of("11"));

        firstPrize.setNextPrize(secondPrize).setNextPrize(thirdPrize).setNextPrize(eighthPrize);

        System.out.println(firstPrize.check("111001"));
    }
}
