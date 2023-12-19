
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                break;
            }
            sum += myNumber;


        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
