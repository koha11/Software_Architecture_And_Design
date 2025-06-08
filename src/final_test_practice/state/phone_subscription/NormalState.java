package final_test_practice.state.phone_subscription;

public class NormalState extends SubscriptionState{

    public NormalState() {
        super();
        maxBalance = 100_000;
    }

    @Override
    public void handleTopUp(int money, Subscriber s) {
        System.out.println("Da nap " + money);
        System.out.println("So du hien tai " + (money + s.balance));
        s.setBalance(money + s.balance);
        if(money + s.balance >= maxBalance)
        {
            s.setState(new SilverState());
            System.out.println("Thang cap len bac");
        }
    }

//    @Override
//    public void handleMakeCall(int minutes, Subscriber s) {
//        int total = calcCallCharges.calc(s.balance, minutes);
//
//        System.out.println("Da goi " + minutes + " phut ton " + total);
//    }

    @Override
    public void handlePrintInfo(Subscriber s) {

    }
}
