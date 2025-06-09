package final_test_practice.state.phone_subscription;

public abstract class SubscriptionState
{
    protected CallChargesCalc calcCallCharges;
    protected int maxBalance;

    public SubscriptionState() {
        HigherCallCharges goldTier = new HigherCallCharges(1_200, 200_000);
        HigherCallCharges silverTier = new HigherCallCharges(1_500, 100_000);
        NormalCallCharges normalTier = new NormalCallCharges(1_800, 0);

        goldTier.setNext(silverTier).setNext(normalTier);

        calcCallCharges = goldTier;
    }

    public abstract void handleTopUp(int money, Subscriber s);

    public void handleMakeCall(int minutes, Subscriber s) {
        int total = calcCallCharges.calc(s.balance, minutes);
        if(s.balance < total)
            System.out.println("So tien trong tai khoan cua KH ko du");
        else
        {
            s.balance-= total;
            System.out.println("Da goi " + minutes + " phut ton " + total);
        }
    }

    public abstract void handlePrintInfo(Subscriber s);
}
