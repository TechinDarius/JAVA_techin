package Dariaus.Shapes;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        Shape s1 = new Shape();
//        System.out.println(s1);
//        Shape s2 = new Shape("blue", false);
//        System.out.println(s2);

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


        ArrayList<Shape> shapes = new ArrayList<>();
        double sum = 0;
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(c3);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(r3);
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);

        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        System.out.println("\nAll circles areas: " + sum + "\n");

        System.out.println("\n \ta. Atspausdinkite visus kolekcijos elementus;\n");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n \tb. Apskaičiuokite visų figūrų plotą (Shape klasėje gali atsirasti papildomas metodas)\n");

        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        System.out.println("\nAll shapes areas Sum: " + sum + "\n");

        System.out.println("\n \tc. Raskite figūrą su didžiausiu perimetru;\n");
        double maxPerimeter = 0;
        Shape shapeWithMaxPerimeter = null;
        for (Shape shape : shapes) {
            if (shape.getPerimeter() > maxPerimeter) {
                maxPerimeter = shape.getPerimeter();
                shapeWithMaxPerimeter = shape;
            }
        }
        System.out.println("\nAll shapes max perimeter " + maxPerimeter + " shape: " + shapeWithMaxPerimeter + "\n");

        System.out.println("\n \td. Atspausdinkite tik kvadratų kraštinių reikšmes (panaudokite getSide() metodą)\n");
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println(((Square) shape).getSide());
            }
        }
    }


}
