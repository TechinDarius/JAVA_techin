
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();
        System.out.println("Enter the secont string:");
        String secondString = scan.nextLine();

        System.out.println(firstString.equals(secondString)?"Same":"Different");
        //firstString.equals(secondString)?"Same":"Different";

    }
}
