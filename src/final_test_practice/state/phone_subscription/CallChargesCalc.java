package final_test_practice.state.phone_subscription;

public abstract class CallChargesCalc {
    protected int chargesPerMinutes;
    protected int minBalance;

    public CallChargesCalc(int chargesPerMinutes, int minBalance) {
        this.chargesPerMinutes = chargesPerMinutes;
        this.minBalance = minBalance;
    }

    public abstract int calc(int balance, int minutes);
    public abstract CallChargesCalc setNext(CallChargesCalc next);

}
