package creational.factory.shape;

import creational.factory.shape.shapes.Circle;
import creational.factory.shape.shapes.Rectangle;
import creational.factory.shape.shapes.Triangle;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<ShapeType, Shape> instances = new HashMap<>();
    public static Shape getInstance(ShapeType tag) {
        if (instances.get(tag) == null)
            instances.put(tag, createShape(tag));

        return instances.get(tag);
    }

    private static Shape createShape(ShapeType shapeType){
        switch (shapeType) {

            case TRIANGLE -> {
                return new Triangle();
            }

            case CIRCLE -> {
               return new Circle();
            }

            case RECTANGLE -> {
                return new Rectangle();
            }
        }

        return new Rectangle();
    }
}
