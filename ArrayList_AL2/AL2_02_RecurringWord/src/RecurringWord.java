
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<>();
        while (true) {
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.printf("You gave the word " + word + " twice");
                break;
            }
            words.add(word);
        }
    }
}
