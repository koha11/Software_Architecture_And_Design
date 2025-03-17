package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Triangle extends Shape {

    @Override
    public String draw() {
        return "Triangle with brush: " + getBrush() + ", paper: " + getPaper() + ", frame: " + getFrame() ;
    }
}
