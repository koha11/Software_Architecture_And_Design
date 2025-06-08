package final_test_practice.state.phone_subscription;

public class HigherCallCharges extends CallChargesCalc{
    private CallChargesCalc next;

    public HigherCallCharges(int chargesPerMinutes, int minBalance) {
        super(chargesPerMinutes, minBalance);
    }

    @Override
    public int calc(int balance, int minutes) {
        if(balance <= minBalance)
            return next.calc(balance, minutes);

        int charges = minutes * chargesPerMinutes;

        System.out.println("so tien can de goi het o bac nay " + (minutes * chargesPerMinutes));
        System.out.println("so tien ton o bac nay: " + (charges - minBalance >= 0 ? charges - minBalance : charges));

        if(charges <= minBalance)
            return charges;
        else
            return charges + next.calc(charges - minBalance, minutes - (charges - minBalance)/chargesPerMinutes);
    }

    @Override
    public CallChargesCalc setNext(CallChargesCalc next) {
        this.next = next;
        return next;
    }
}
