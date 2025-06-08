package final_test_practice.decorator.B3;

public class Button extends ComponentWidget{
    public Button(Widget widget) {
        super(widget);
    }

    @Override
    public String build() {
        return widget.build() + "Button + ";
    }
}
