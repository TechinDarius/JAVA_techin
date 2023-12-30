
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String a1="abc";
        String a2="abcde";
        solution(a1);
        solution(a2);
        System.out.println(Arrays.toString(solution(a1)));

        System.out.println(Arrays.toString(solution(a2)));
//        String numbers = "1 2 3 4 5";
//highAndLow(numbers);
//        System.out.println(highAndLow(numbers));
//        long n = 3037000498L * 3037000498L;
//        long n2 = Math.multiplyExact(3037000499L, 3037000499L);
//
////        findNextSquare(n);
////        System.out.println(findNextSquare(n));
////        System.out.println(n2);
//
//        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));


        // Test your program here
        //int[] array = {-3, 2, 3, 4, 7, 8, 12};
//        int[] array = {0, 4};
//        Scanner reader = new Scanner(System.in);
//
//        System.out.print("Numbers in the array " + Arrays.toString(array));
//        System.out.println();
//
//        System.out.print("Enter searched number: ");
//        String searchedValue = reader.nextLine();
//        System.out.println();
//
//        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
//
//        // Print here the result
//        System.out.println(!result ? "Value " + searchedValue + " is in the array" : "Value " + searchedValue + " is not in the array");
    }

    public static ArrayList<Long> separateDigits(long n) {
        ArrayList<Long> numbers = new ArrayList<>();
        boolean run = true;
        while (run) {
            long temp = n - n / 10 * 10;
            numbers.add(temp);
            n = n / 10;
            if (n < 1) {
                run = false;
            }
        }
        return numbers;
    }

    public static long multipyNumbers(ArrayList<Long> numbers) {
        long sum = numbers.size() > 1 ? 1 : 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum *= numbers.get(i);
        }
        return sum;
    }

    public static int persistence(long n) {

        int pers = 0;
        while (n >= 10) {
            separateDigits(n);
            n = multipyNumbers(separateDigits(n));
            pers++;
        }
        return pers; // your code
    }

    //square
    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        return sqrt * sqrt == sq ? (sqrt + 1) * (sqrt + 1) : -1;
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String[] solution(String s) {

        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] solution = new String[s.length() / 2];
        int j=0;
        for (int i = 0; i <=s.length()-2; i+=2) {
                solution[j] = s.substring(i, i + 2);
                j++;
        }
        return solution;
    }
}