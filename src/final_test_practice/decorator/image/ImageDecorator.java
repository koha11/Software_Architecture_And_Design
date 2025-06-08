package final_test_practice.decorator.image;

public class ImageDecorator extends ImageProcess{
    protected String value;
    protected ImageProcess image;

    public ImageDecorator(String value, ImageProcess image) {
        this.value = value;
        this.image = image;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void process() {
        image.process();
    }
}
