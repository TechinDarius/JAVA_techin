package lt.techin.praktinis;

public class ArraysTask2D {

    public static void main(String[] args) {

        // (Papildomai) Įgyvendikite visus metodus (turi pažaliuoti unit testai).
        //  Pateiktas dvimatis masyvas programos patikrinimui. Elementų reikšmes galite keisti.

        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);

        System.out.println("Sum: " + getAverageMark(marks));


    }


    public static double getAverageMark(int[][] marks) {
        //TODO
        int sum = 0;
        for (int[] mark : marks) {
            for (int i : mark) {
                sum += i;
//                for (int i = 0; i < marks.length; i++) {
//                    for (int j = 0; j < marks[i].length; j++) {
//                        sum+=marks[i][j];
            }
        }
        return sum;
    }

    public static int getMinMark(int[][] marks) {
        //TODO
        int min = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (min > marks[i][j]) {
                    min = marks[i][j];
                }
            }
        }

        return min;
    }


    public static int getMaxMark(int[][] marks) {
        int max = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (max < marks[i][j]) {
                    max = marks[i][j];
                }
            }
        }

        return max;
    }


}
