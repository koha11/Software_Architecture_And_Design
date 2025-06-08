package final_test_practice.decorator.image;

public class MainImage {
    public static void main(String[] args) {
        ImageProcess image = new BasicProcess("anh.jpg");

        image = new BorderDecorator("12px", image);

        image = new WatermarkDecorator("my watermark", image);

        image = new FilterDecorator("grayscale", image);

        image.process();
    }
}
