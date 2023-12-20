
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.isEmpty()) {
                break;
            } else {
                String[] words = phrase.split(" ");
                System.out.println(words[words.length-1]);
            }
        }
    }
}
