
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number>0?"The number is positive":"The number is not positive");
    }
}
