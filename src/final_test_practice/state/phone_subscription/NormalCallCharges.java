package final_test_practice.state.phone_subscription;

public class NormalCallCharges extends CallChargesCalc{
    public NormalCallCharges(int chargesPerMinutes, int minBalance) {
        super(chargesPerMinutes, minBalance);
    }

    @Override
    public int calc(int balance, int minutes) {
        System.out.println("so tien o bac thap nhat: " + (minutes * chargesPerMinutes));
        return minutes * chargesPerMinutes;
    }

    @Override
    public CallChargesCalc setNext(CallChargesCalc next) {
        return null;
    }
}
