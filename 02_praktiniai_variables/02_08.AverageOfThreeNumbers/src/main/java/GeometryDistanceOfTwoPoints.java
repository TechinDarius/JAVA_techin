import java.util.Scanner;

public class GeometryDistanceOfTwoPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = Double.parseDouble(scan.nextLine());
        System.out.println("Enter y1");
        double y1 = Double.parseDouble(scan.nextLine());
        System.out.println("Enter x2");
        double x2 = Double.parseDouble(scan.nextLine());
        System.out.println("Enter y2");
        double y2 = Double.parseDouble(scan.nextLine());
        double answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the tho points is " + answer);


    }
}
