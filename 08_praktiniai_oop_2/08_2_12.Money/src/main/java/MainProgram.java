import java.util.List;

public class MainProgram {

    static public void main(String[] args) {
        // test your class here
//        Money a=new Money(10,0);
//        Money b = new Money(5,0);
//
//        Money c = a.plus(b);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        a=a.plus(c);
//        System.out.println();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        Money a = new Money(10, 0);
//        Money b = new Money(3, 0);
//        Money c = new Money(5, 0);
//        System.out.println(a.lessThat(b));
//        System.out.println(b.lessThat(c));

        Money a = new Money(10, 00);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println();
        c = c.minus(a);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        String str = "HelloWord";
        str = str.replace("World", "");
        System.out.println(str);




    }

}
