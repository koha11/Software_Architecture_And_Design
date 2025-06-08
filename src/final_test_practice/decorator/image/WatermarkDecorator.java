package final_test_practice.decorator.image;

public class WatermarkDecorator extends  ImageDecorator{
    public WatermarkDecorator(String value, ImageProcess image) {
        super(value, image);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("add watermark " + value);
    }
}
