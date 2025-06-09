package final_test_practice.decorator.bevarage;

public class Mocha extends CondimentDecorator{
    public Mocha(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int cost() {
        return super.cost() + 15_000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Mocha";
    }
}
