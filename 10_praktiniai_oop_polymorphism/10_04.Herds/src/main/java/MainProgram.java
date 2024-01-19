

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
//        Organism o = new Organism(20,30);
//        System.out.println(o);
//        o.move(-10,5);
//        System.out.println(o);

        Herd h = new Herd();
        h.addToHerd(new Organism(57, 66));
        h.addToHerd(new Organism(73, 56));
        h.addToHerd(new Organism(46, 52));
        h.addToHerd(new Organism(19, 107));
        System.out.println(h);
        h.move(10, -10);
        System.out.println("Moved:\n" + h);
    }
}
