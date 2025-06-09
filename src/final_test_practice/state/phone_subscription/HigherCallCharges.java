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

        System.out.println("so tien can de goi het o bac nay " + charges);
        System.out.println("so tien ton o bac nay: " + (balance - minBalance >= 0 ? balance - minBalance : charges) + " va duoc " + (balance - minBalance >= 0 ? (balance - minBalance)/chargesPerMinutes : charges/chargesPerMinutes) + " phut");

        if(charges <= minBalance)
            return charges;
        else
            return charges + next.calc(charges - minBalance, minutes - (balance - minBalance)/chargesPerMinutes);
    }

    @Override
    public CallChargesCalc setNext(CallChargesCalc next) {
        this.next = next;
        return next;
    }
}
