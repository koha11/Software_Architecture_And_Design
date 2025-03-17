package creational.factory.shape.shapes;

import creational.factory.shape.Shape;

public class Rectangle extends Shape {

    @Override
    public String draw() {
        return "Rectangle with brush: " + getBrush() + ", paper: " + getPaper() + ", frame: " + getFrame() ;
    }
}
