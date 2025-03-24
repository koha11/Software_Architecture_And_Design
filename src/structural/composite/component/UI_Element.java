package structural.composite.component;

abstract public class UI_Element {
    String name;

    public UI_Element(String name) {
        this.name = name;
    }

    abstract public void build();
    abstract public UI_Element addComponent();
    abstract public void removeComponent();
}
