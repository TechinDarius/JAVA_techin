
import java.util.Scanner;

public class noname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minutes:");
        long min = Long.parseLong(scan.nextLine());
        long years=min/(365*24*60);
        long days=(min-(years*365*24*60))/(24*60);

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}