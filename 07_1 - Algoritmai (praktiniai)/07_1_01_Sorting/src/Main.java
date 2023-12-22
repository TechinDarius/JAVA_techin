import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(values));
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static int biggest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = Integer.MAX_VALUE;
        int newIndex = -1;
        for (int i = index; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                newIndex = i;
            }
        }
        return newIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int index = indexOfTheSmallestStartingFrom(array, j);
            swap(array, index, j);
            System.out.println(Arrays.toString(array));
        }
    }
}

