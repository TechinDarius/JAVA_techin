
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            myNumber = Integer.parseInt(scanner.nextLine());
            if (myNumber == 0) {
                break;
            }
            else if (myNumber < 0) {
                counter++;
                System.out.println("Unsuitable number");
            } else {
                System.out.println(myNumber*myNumber);
            }

        }
        // System.out.println(counter);
    }
}