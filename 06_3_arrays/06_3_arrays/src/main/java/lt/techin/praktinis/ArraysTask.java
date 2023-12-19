package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        System.out.println("Generate random array: size 5, min 10, max 25");
        System.out.println(Arrays.toString(generateRandomArray(5, 10, 25)));
        System.out.println();
        System.out.println("Remove from array " + Arrays.toString(arr) + " element with index 4:");
        System.out.println(Arrays.toString(removeElementAndReturnNewArray(arr, 4)));
        System.out.println();
        System.out.println("Insert value 99 to array " + Arrays.toString(arr) + " before element with index 4:");
        System.out.println(Arrays.toString(insertElementAndReturnNewArray(arr, 4, 99)));
        System.out.println();
        System.out.println("Returning reverse array " + Arrays.toString(arr));
        //System.out.println(Arrays.toString(reverseArray(arr)));
        System.out.println("print reverse array");
        reverseInPlace(arr);

    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int number = (int) (min + (max - min + 1) * Math.random());
            arr[i] = number;
        }
        return arr;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        if (k <= arr.length && k >= 0) {
            int[] arrB = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != k) {
                    arrB[j] = arr[i];
                } else {
                    j--;
                }
                j++;
            }
            return arrB;
        } else {
            return null;
        }
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        //TODO
        if (k <= arr.length && k >= 0) {
            int[] arrB = new int[arr.length + 1];
            int j = 0;
            for (int i = 0; i <= arr.length; i++) {
                if (i != k) {
                    arrB[i] = arr[j];
                } else {
                    arrB[k] = x;
                    j--;
                }
                j++;

            }
            return arrB;
        }
        return null;
    }


    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        //TODO
        int[] rra = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rra[arr.length - 1 - i] = arr[i];
        }
        return rra;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace1(int[] arr) {
        //TODO
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void reverseInPlace(int[] arr) {
        //TODO
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return 0;
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return 0;
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        return 0;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        return 0;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        return 0;
    }

    //Raskite masyvo elementų vidurkį
    public static int getAverage(int[] arr) {
        //TODO
        return 0;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        return 0;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        return 0;
    }


}
