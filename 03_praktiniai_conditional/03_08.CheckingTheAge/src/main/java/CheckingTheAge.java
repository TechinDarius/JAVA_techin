
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age=Integer.parseInt(scan.nextLine());

//        if (age<0){
//            System.out.println("Impossible!");
//        } else if (age <= 120) {
//            System.out.println("OK");
//        } else {
//            System.out.println("Impossible!");
//        }
        System.out.println(age>=0 && age<=120?"OK":"Impossible!");
    }
}
