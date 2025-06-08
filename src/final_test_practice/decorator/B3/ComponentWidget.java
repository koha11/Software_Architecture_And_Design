package final_test_practice.decorator.B3;

public abstract class ComponentWidget extends Widget{
    protected Widget widget;

    public ComponentWidget(Widget widget) {
        this.widget = widget;
    }
}
