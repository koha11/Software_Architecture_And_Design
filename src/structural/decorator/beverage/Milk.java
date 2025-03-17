package structural.decorator.beverage;

public class Milk extends CondimentDecorator{

    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 5000;
    }
}
