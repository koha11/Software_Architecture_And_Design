package final_test_practice.decorator.image;

public class BorderDecorator extends ImageDecorator{
    public BorderDecorator(String value, ImageProcess image) {
        super(value, image);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("add border " + value);
    }
}
