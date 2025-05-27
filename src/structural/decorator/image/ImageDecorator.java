package structural.decorator.image;

public class ImageDecorator implements ImageProcess {
    private ImageProcess image;

    public ImageDecorator(ImageProcess imageProcess, String value) {
        this.image = imageProcess;
    }

    @Override
    public void process() {
    }
}
