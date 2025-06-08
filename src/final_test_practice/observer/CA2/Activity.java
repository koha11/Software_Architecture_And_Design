package final_test_practice.observer.CA2;

public class Activity implements ButtonListener{
    private Button button;
    private int amount;

    public Activity(Button button) {
        this.button = button;
        amount = 0;
        button.addListener(this);
    }

    @Override
    public void onClick() {
        System.out.println("“bạn click lần thứ " + ++amount + "\"");
    }
}
