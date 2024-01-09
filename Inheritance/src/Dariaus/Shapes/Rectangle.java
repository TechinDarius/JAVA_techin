package Dariaus.Shapes;

import java.lang.reflect.WildcardType;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (1.0) * length * width;
    }

    public double getPerimeter() {
        return (2.0) * (length + width);
    }

    @Override
    public String toString() {
        return "A rectangle with width = "+getWidth()+" and length "+getLength()+", which is a subclass of "+super.toString();
    }
}
