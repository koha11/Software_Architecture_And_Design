package final_test_practice.state.phone_subscription;

public class Subscriber {
    protected int balance;
    private SubscriptionState state;

    public Subscriber() {
        this.balance = 0;
        this.state = new NormalState();
    }

    public void topUp(int money) {
        state.handleTopUp(money, this);
    }

    public void makeCall(int minutes) {
        state.handleMakeCall(minutes, this);
    }

    public void printInfo() {
        state.handlePrintInfo(this);
    }

    public void setState(SubscriptionState state) {
        this.state = state;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
