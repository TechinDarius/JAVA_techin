
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int sum = 0;
        int count = 0;
        double avg;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                if (sum > 0) {
                    System.out.println((1.0 * sum / count));
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if (myNumber > 0) {
                sum += myNumber;
                count++;
            }
        }

    }
}
