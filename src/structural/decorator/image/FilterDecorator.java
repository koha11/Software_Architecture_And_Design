package structural.decorator.image;

public class FilterDecorator extends ImageDecorator {
    public FilterDecorator(ImageProcess imageProcess, String value) {
        super(imageProcess, value);
    }
}
