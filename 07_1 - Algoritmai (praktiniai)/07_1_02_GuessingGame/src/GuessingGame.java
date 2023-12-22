import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int mid = (upperLimit - lowerLimit) / 2;
        // write the guessing logic here
        //String greatherThenMid ="Is your number greater than " + mid + " y/n: ";
        System.out.print("Is your number greater than " + mid + " y/n: ");
        while (upperLimit != lowerLimit) {
            String question = reader.nextLine();
            if (upperLimit - lowerLimit == 1) {
                if (question.equals("y")) {
                    System.out.println("Your number is " + upperLimit);
                } else {
                    System.out.println("Your number is " + lowerLimit);
                }
            } else if (question.equals("y")) {
                lowerLimit = mid;
                mid = (upperLimit + lowerLimit) / 2;
                System.out.print("Is your number greater than " + mid + " y/n: ");
            } else if (question.equals("n")) {
                upperLimit = mid;
                mid = (upperLimit + lowerLimit) / 2;
                System.out.print("Is your number greater than " + mid + " y/n: ");
            } else {
                System.out.println(("Is your number greater than " + mid + " y/n "));
                System.out.print("Enter y or n : ");
            }
        }
        System.out.println("Your number is " + mid);

    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
