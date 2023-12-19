
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println(num1 == num2 ? "the numbers are equal!" : num1 > num2 ? "Greather number is: " + num1 : "Greather number is: " + num2);

    }
}
