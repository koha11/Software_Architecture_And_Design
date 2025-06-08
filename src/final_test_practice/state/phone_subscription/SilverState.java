package final_test_practice.state.phone_subscription;

public class SilverState extends SubscriptionState{

    @Override
    public void handleTopUp(int money, Subscriber s) {
        System.out.println("Da nap " + money);
        System.out.println("So du hien tai " + (money + s.balance));
    }

//    @Override
//    public void handleMakeCall(int minutes, Subscriber s) {
//
//    }

    @Override
    public void handlePrintInfo(Subscriber s) {

    }
}
