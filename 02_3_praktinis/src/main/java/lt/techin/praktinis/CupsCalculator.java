package lt.techin.praktinis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CupsCalculator {
    public static void main(String[] args) {
        CupsCalculator cc = new CupsCalculator();
        cc.calculateCups(10);
    }
    public void calculateCups(int numberOfCups) {

        int fullBoxes = numberOfCups/3;
        int left = numberOfCups-3*fullBoxes;
        System.out.println("Deziu: "+fullBoxes);
        System.out.println("Liko puodeliu: "+left);
    }

}
