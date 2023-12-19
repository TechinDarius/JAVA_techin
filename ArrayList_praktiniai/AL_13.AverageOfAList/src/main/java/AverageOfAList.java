
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();
        int sum=0;
        while(true){
            int number=Integer.parseInt(scanner.nextLine());
            if(number==-1){break;}
            numbers.add(number);
            sum+=number;
        }
        System.out.println();
        System.out.println("Average: "+1.0*sum/numbers.size());

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
