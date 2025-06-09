package final_test_practice.decorator.bevarage;

public class CondimentDecorator extends Bevarage{
    private Bevarage bevarage;

    public CondimentDecorator(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public int cost() {
        return bevarage.cost();
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription();
    }
}
