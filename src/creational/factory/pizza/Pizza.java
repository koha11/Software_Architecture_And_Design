package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder builder = new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    @Override
    public String toString() {
        return "Pizza{" +
                "builder=" + builder +
                '}';
    }

    public StringBuilder getBuilder() {
        return builder;
    }
}
