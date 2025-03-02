package behavioral.strategy.duck_example_64cntt;

public class MainDuck {
    public static void main(String[] args) {
        Duck d = new VitQuay(new BayVong(), new SQuack());
        d.setQuackBehavior(new YummyQuack());
        d.display();
    }
}
