
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.isEmpty()) {
                break;
            } else {
                String[] words = phrase.split(",");
                //String name = words[0];
                int age = Integer.parseInt(words[1]);
                if (age > max) {
                    max = age;
                }
            }
        }
        System.out.printf("Age of the oldest: %d", max);
    }
}
