package behavioral.observer.console;

public class MainConsole {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity(button);

        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
    }
}
