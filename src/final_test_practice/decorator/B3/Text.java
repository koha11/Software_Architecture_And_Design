package final_test_practice.decorator.B3;

public class Text extends ComponentWidget{
    public Text(Widget widget) {
        super(widget);
    }

    @Override
    public String build() {
        return widget.build() + "Text + ";
    }
}
