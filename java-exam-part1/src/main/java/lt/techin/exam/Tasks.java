package lt.techin.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Tasks {


    /* Paduotus duomenis kilometrais ir metrais konvertuoja į metrus ir rezultatą išveda į ekraną
     * pvz. kilometers = 4, meters = 67 =>
     * Atspausdina:
     * 4067 metrų
     */
    public static void convertToMeters(int kilometers, int meters) {
        System.out.println(kilometers * 1000 + meters + " metrų");
    }


    /*Kasininkė grąžą pirkėjui pabėrė centais ct. Reikia apskaičiuoti kiek tai yra eurų  ir centų .
     * pvz. 234 ct => atspausdina:
     * Gauta: 2 Eur ir 34 ct
     */
    public static void convertCentsToEuros(int cents) {
        System.out.println("Gauta: " + cents / 100 + " Eur ir " + cents % 100 + " ct");
    }


    /* Raskite skaičių a, b ir c vidurkį
     */
    public static double averageOf(int a, int b, int c) {
        return (1.0 * (a + b + c) / 3);
        //throw new UnsupportedOperationException("Parašykite implementaciją");
    }


    /* Duoti trys skaičiai. Parašykite metodą, kuris nustatytų, ar bent vienas iš jų yra lyginis.
    Pvz.:
     a = 1, b = 3, c = 5 => false
     a = 1, b = 3, c = 6 => true

    * */
    public static boolean isEven(int a, int b, int c) {
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) return true;
        return false;
        //throw new UnsupportedOperationException("Parašykite implementaciją");
    }


    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) return true;
        return false;
    }


    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) System.out.println(i);
        }
    }


    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num > number) count++;
        }
        return count;
    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        double min = numbers.getFirst();
        for (Double number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }


    /*
     * Paskaičiuokite kiek simbolių yra String'ų List'e
     */
    public static int countLettersInList(List<String> words) {
        int counter = 0;
        for (String word : words) {
            counter += word.length();
        }
        return counter;
    }


    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        int counter = 0;
        for (String string : strings) {
            if (string.toLowerCase().contains(word.toLowerCase())) {
                counter++;
            }
        }
        return counter;

//return strings.stream().filter(Cont)
    }


    /*
     * Paskaičiuokite kiek liste elementų, kur savybė displayed yra true
     */
    public static int countDisplayedElements(List<Element> elements) {
        int count = 0;
        for (Element element : elements) {
            if (element.isDisplayed()) {
                count++;
            }
        }
        return count;
    }

    /*
     * Grąžinkite listą elementų kurių tekstas nėra tuščias arba sudarytas tik iš tarpų
     */
    public static List<Element> findElementsWithNonEmptyTexts(List<Element> elements) {
        List<Element> myElements = new ArrayList<>();
        for (Element element : elements) {
            if (element != null && !element.getText().trim().isEmpty()) {
                myElements.add(element);
            }
        }
        return myElements;

    }

    /*
     * Elementų tekste užrašytos prekių kainos, pvz. "$10.52"
     * Raskite  suma
     */
    public static double findSumOfPrices(List<Element> elements) {
        return elements.stream().map(e->e.getText().split("\\$")).mapToDouble(e-> Double.parseDouble(e[1])).sum();
    }


}
