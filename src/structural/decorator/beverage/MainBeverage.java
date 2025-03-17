package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new Espresso("Espresso coffee");

        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Milk("with cow milk", b);

        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Mocha("with mocha", b);

        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
