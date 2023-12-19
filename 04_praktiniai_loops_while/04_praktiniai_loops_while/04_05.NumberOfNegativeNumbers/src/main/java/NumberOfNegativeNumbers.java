
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                break;
            }
            if (myNumber < 0) {
                counter++;
            }


        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
