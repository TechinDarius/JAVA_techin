
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String longestName="";
        int count=0;
        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.isEmpty()) {
                break;
            } else {
                String[] words = phrase.split(",");
                String name = words[0];
                int year = Integer.parseInt(words[1]);
                //longestName=name.length();
                if (longestName.length()<name.length()){longestName=name;}
                    sum += year;
                    count++;
            }
        }
        double avg=1.0*sum/count;
        System.out.println("Longest name: " + longestName);
        System.out.printf("Name of the oldest: %.1f",avg);

    }
}
