import java.util.concurrent.CancellationException;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        boolean answer = false;
        //int index = -1; jei reiketu indexo
        while (end <= beginning) {
            int middle = (end - beginning) / 2 + end;
            if (searchedValue == array[middle]) {
               // index = middle; //rasto skaiciaus indeksas, galima panaudoti, jei reiketu nurodytim, kuris tai skaicius masyve
                answer = true;
                return answer;
            } else if (searchedValue < array[middle]) {
                end = middle - 1;
            } else {
                beginning = middle + 1;
            }
        }
        return answer;
}
}