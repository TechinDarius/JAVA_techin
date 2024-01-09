package Dariaus.Shapes;

public class App {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("blue", false);
        System.out.println(s2);

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(5, "green", false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 5);
        Rectangle r3 = new Rectangle(3, 6, "yellow", false);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        Square sq1 = new Square();
        Square sq2 = new Square(5);
        Square sq3 = new Square(5, "black", false);

        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);

    }
}
