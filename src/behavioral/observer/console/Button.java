package behavioral.observer.console;

public class Button {
    private MyClickListener activity;

    public Button() {
    }

    public void setActivity(MyClickListener activity) {
        this.activity = activity;
    }

    public void click() {
        activity.onClick();
    }
}
