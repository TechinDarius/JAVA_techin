
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String pass = scan.nextLine();
//        switch (pass){
//            case "Caput Draconis":
//                System.out.println("Welcome!");break;
//            default:
//                System.out.println("Off with you!");
//        }


//veikia tik nuo 14 versijos
        System.out.println(switch (pass){
            case "Caput Draconis"-> "Welcome!";
            default-> "Off with you!";
        });
    }
}
