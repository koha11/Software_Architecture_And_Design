package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Circle extends Shape {

    @Override
    public String draw() {
        return "Circle with brush: " + getBrush() + ", paper: " + getPaper() + ", frame: " + getFrame() ;
    }
}
