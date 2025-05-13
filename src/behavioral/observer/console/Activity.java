package behavioral.observer.console;

public class Activity implements MyClickListener{
    private int count = 0;
    Button button;

    public Activity(Button button) {
        this.button = button;
        button.setActivity(this);
    }

    @Override
    public void onClick() {
        ++count;
        System.out.println("Ban da click lan thu " + count);
    }
}
