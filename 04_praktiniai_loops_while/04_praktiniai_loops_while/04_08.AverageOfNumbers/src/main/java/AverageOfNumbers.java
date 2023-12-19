
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int sum = 0;
        int count=0;
        double avg;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                break;
            }
            sum += myNumber;
            count++;
        }
        System.out.println("Average of the numbers: "+ (1.0*sum/count));

    }
}
