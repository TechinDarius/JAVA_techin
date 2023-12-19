
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.print("Search for? ");
        int number = Integer.parseInt(scanner.nextLine());
        int myIndex = -1;
        // implement here finding the indices of a number
        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i)) {
                myIndex = i;
                System.out.println(number + " is at index " + myIndex);

            }
        }
        //System.out.println(number + " is at index " + myIndex);

    }
}
