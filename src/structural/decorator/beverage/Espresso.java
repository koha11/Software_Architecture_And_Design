package structural.decorator.beverage;

public class Expresso extends Beverage {

    public Expresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 25000;
    }
}
