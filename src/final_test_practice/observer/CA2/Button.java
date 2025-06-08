package final_test_practice.observer.CA2;

public class Button{
    private ButtonListener listener;

    public Button() {
        this.listener = null;
    }

    public void addListener(ButtonListener listener) {
        this.listener = listener;
    }

    public void click() {
        listener.onClick();
    }
}
