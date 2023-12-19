
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int sum = 0;
        int count=0;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                break;
            }
            sum += myNumber;
            count++;
        }
        System.out.println("Number of numbers: "+ count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
