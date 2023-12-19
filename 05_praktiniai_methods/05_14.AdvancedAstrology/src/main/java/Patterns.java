public class Patterns {
    public static void drawTriangle(int size) {
        for (int i = size; i > 0; i--) {
            drawLine(i);
            System.out.println();
        }
    }

    public static void drawTriangleRevert(int size) {
        int j = 0;
        for (int i = size; i > 0; i--) {
            drawSpace(j);
            drawLine(i);
            System.out.println();
            j++;
        }
    }

    public static void drawLine(int lineLength) {
        for (int i = 0; i < lineLength; i++) {
            System.out.print("# ");
        }
    }

    public static void drawSpace(int lineLength) {
        for (int i = 0; i < lineLength; i++) {
            System.out.print("  ");
        }
    }

    public static void drawNumbers(int height) {
        for (int i = height; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void drawNumbersRevert(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print(i + " ");
        }
    }

    public static void drawTriangleNumbers(int size) {
        for (int i = 0; i <= size; i++) {
            drawNumbers(i);
            System.out.println();
        }
    }

    public static void drawTriangleRevertNumbers(int size) {
        int j = size;
        for (int i = 0; i <= size; i++) {
            drawSpace(j);
            drawNumbersRevert(i);
            System.out.println();
            j--;
        }
    }

    public static void main(String[] args) {
        //drawLine(5);
        System.out.println("------------------NEXT-------------------------");
        System.out.println();
        drawTriangle(8);
        System.out.println("------------------NEXT-------------------------");
        System.out.println();
        drawTriangleRevert(8);
        System.out.println("------------------NEXT-------------------------");
        System.out.println();
        drawNumbers(8);
        System.out.println();
        System.out.println("------------------NEXT-------------------------");
        System.out.println();
        drawTriangleNumbers(8);
        System.out.println("------------------NEXT-------------------------");
        System.out.println();
        drawTriangleRevertNumbers(8);

    }
}
