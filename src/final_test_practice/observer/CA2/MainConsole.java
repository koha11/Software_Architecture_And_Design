package final_test_practice.observer.CA2;

public class MainConsole {
    public static void main(String[] args) {
        var button = new Button();
        var activity = new Activity(button);

        button.click();
        button.click();
        button.click();
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
