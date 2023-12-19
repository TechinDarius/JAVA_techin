
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 9999) {


                break;
            }
            numbers.add(number);
        }
        int min = numbers.get(0);
        //int myIndex = -1;
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);

            }
        }

        System.out.println("Smallest number: " + min);
        for (int i = 0; i < numbers.size(); i++) {
            if (min == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times


    }
}
