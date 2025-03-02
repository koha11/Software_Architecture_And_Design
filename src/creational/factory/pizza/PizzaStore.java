package creational.factory.pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType t);
    public Pizza orderPizza(PizzaType t) {
        Pizza p = createPizza(t);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
