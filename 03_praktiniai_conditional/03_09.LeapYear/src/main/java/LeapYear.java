
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.parseInt(scan.nextLine());

        //veikia
        //String isLeap ="This year is a leap year.";
        //       String isNotLeap ="This year is not a leap year.";
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0){System.out.println(isLeap);}
//                else {System.out.println(isNotLeap);}
//            } else {
//                System.out.println(isLeap);
//            };
//        } else {
//            System.out.println(isNotLeap);
//
//        }

        System.out.println((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "This year is a leap year." : "This year is not a leap year.");
    }
}
