package final_test_practice.decorator.bevarage;

public class Milk extends CondimentDecorator{
    public Milk(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int cost() {
        return super.cost() + 10_000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " extra milk";
    }
}
