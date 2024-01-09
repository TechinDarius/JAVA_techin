package dariaus;

public class Test {
    public static void main(String[] args) {
        System.out.println("\t CIRCLE");
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getColor());
        //System.out.println(c4.setRadius(4.0));
        System.out.println(c1.toString());

        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c2);

        //rectangle
        System.out.println("\t RECTANGLE");
        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has length of " + r1.getLength() + " width of " + r1.getWidth() + " and area of " + r1.getArea());
        System.out.println(r1);
        //Employee
        System.out.println("\n EMPLOYEE");
        Employee e1 = new Employee(1, "Vardenis", "Pavardenis", 5000);
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
        System.out.println("\n\tINVOICE");
        InvoiceItem in1 = new InvoiceItem("1", "blah", 10, 2.6);
        System.out.println(in1);
        System.out.println("\n\tACCOUNTS");
        Account acc1 = new Account("1", "Mano", 1000);
        Account acc2 = new Account("2", "Tavo", 500);
        System.out.println(acc1);
        System.out.println(acc2);
        acc1.transferTo(acc2, 100);
        System.out.println("1 transfer: -100");
        System.out.println(acc1);
        System.out.println(acc2);
        acc1.transferTo(acc2, 1000);
        System.out.println("2 transfer: -1000");
        System.out.println(acc1);
        System.out.println(acc2);

    }
}
