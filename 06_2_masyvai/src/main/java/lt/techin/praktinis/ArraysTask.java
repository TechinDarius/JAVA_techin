package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
        System.out.println("My array: " + Arrays.toString(arr));
        System.out.println("first " + getFirstElement(arr));
        System.out.println("last " + getLastElement(arr));
        System.out.println("min " + getMin(arr));
        System.out.println("max " + getMax(arr));
        System.out.println("sum " + getSum(arr));
        System.out.println("avg " + getAverage(arr));
        System.out.println("There are " + countElements(arr, 3) + " elements > 3.");
        System.out.println("Return 'true' if there is a number 3: " + contains(arr, 3));
        System.out.println(lastIndexOf(arr, 3) > -1 ? "Last index of 3: " + lastIndexOf(arr, 3): "There is no number 3 in this array");
    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        double avg = 1.0 * ArraysTask.getSum(arr) / arr.length;
        return avg;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int counter = 0;
        for (int i : arr) {
            if (i > n) {
                counter++;
            }
        }
        return counter;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for (int value : arr) {
            if (value == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
