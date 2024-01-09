package dariaus;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        length = 1.0f;
        width = 1.0f;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void setLength(float width) {
        this.width = width;
    }

    public void setWidth(float length) {
        this.length = length;
    }

    public String toString() {
        return "Rectangle \n[\n\tLength: " + length + ",\n" +
                "\tWidth: " + width + ",\n" +
                "\tPerimeter: " + getPerimeter() + ",\n\t" +
                "Area: " + getArea() + "\n" +
                "]";
    }


}

