package final_test_practice.decorator.bevarage;

public class Espresso extends Bevarage{
    @Override
    public int cost() {
        return 70_000;
    }

    @Override
    public String getDescription() {
        return "Espresso ";
    }
}
