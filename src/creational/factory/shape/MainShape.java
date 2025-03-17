package creational.factory.shape;

public class MainShape {
    public static void main(String[] args) {
        Shape rec = ShapeFactory.getInstance(ShapeType.RECTANGLE);
        rec.setBrush("12");
        rec.setPaper("A5");
        System.out.println(rec.draw());

        Shape tri = ShapeFactory.getInstance(ShapeType.TRIANGLE);
        System.out.println(tri.draw());

        Shape cir = ShapeFactory.getInstance(ShapeType.CIRCLE);
        System.out.println(cir.draw());

    }
}
