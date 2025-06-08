package final_test_practice.state.phone_subscription;

public class MainSubscription {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber();

        subscriber.topUp(200_000);
        subscriber.makeCall(100);
    }
}
