public class Patterns2 {
    public static void drawSquare(int size) {
        Patterns.drawLine(size);
        System.out.println();
        for (int i = 2; i < size; i++) {
            Patterns.drawLine(1);
            Patterns.drawSpace(size - 2);
            Patterns.drawLine(1);
            System.out.println();
        }
        Patterns.drawLine(size);
    }

    public static void drawZ(int size) {
        Patterns.drawLine(size);
        System.out.println();
        for (int i = 1; i < size - 1; i++) {
            Patterns.drawSpace(i);
            Patterns.drawLine(1);
            System.out.println();
        }
        Patterns.drawLine(size);
    }

    public static void drawX(int size) {
        Patterns.drawLine(size);
        if (size > 1) {
            System.out.println();
            int j = size - 4;
            for (int i = 1; i <= (size - 3) / 2; i++) {
                Patterns.drawSpace(i);
                Patterns.drawLine(1);
                Patterns.drawSpace(j);
                j = j - 2;
                Patterns.drawLine(1);
                System.out.println();
            }
            Patterns.drawSpace(size / 2);
            Patterns.drawLine(1);
            System.out.println();
            int k = 1;
            for (int i = (size - 3) / 2; i >= 1; i--) {
                Patterns.drawSpace(i);
                Patterns.drawLine(1);
                Patterns.drawSpace(k);
                k = k + 2;
                Patterns.drawLine(1);
                System.out.println();
            }
            Patterns.drawLine(size);
        }
    }

    public static void drawXwithFrame(int size) {
        Patterns.drawLine(size);
        if (size > 1) {
            System.out.println();
            int j = size - 4;
            for (int i = 0; i <= (size - 3) / 2; i++) {
                Patterns.drawLine(1);//pirmas simbolis
                Patterns.drawSpace(i);//pirmas tarpas
                Patterns.drawLine(1); //antras simbolis
                if (j > 0) {
                    Patterns.drawSpace(j);//antras tarpas
                    Patterns.drawLine(1);
                }//trecias simbolis
                Patterns.drawSpace(i);//trecias tarpas
                j = j - 2;
                Patterns.drawLine(1);//paskutinis simbolis
                System.out.println();
            }
            //apatine pattern dalis
            int k = 1;
            for (int i = (size - 4) / 2; i >= 0; i--) {
                if (size > 3) {
                    Patterns.drawLine(1);       //pirmas simbolis
                    Patterns.drawSpace(i);                //pirmastarpas
                    Patterns.drawLine(1);       //antras Simbolis
                    Patterns.drawSpace(k);                  //antras tarpas
                    k = k + 2;
                    Patterns.drawLine(1);       //trecias simbolis
                    Patterns.drawSpace(i);//trecias tarpas
                    Patterns.drawLine(1);// paskutinis simbolis
                    System.out.println();
                }
            }
            Patterns.drawLine(size);
        }
    }

    public static void drawTriangleWithNumbersTwoSide(int size) {
        for (int i = 0; i <= size; i++) {
            Patterns.drawSpace(size - i);
            Patterns.drawNumbersRevert(i);
            Patterns.drawNumbers(i - 1);
            System.out.println();
        }
    }

    public static void drawTriangleGapWithNumbersTwoSide(int size) {
        for (int i = 1; i <= size; i++) {
            if (i != size) {
                Patterns.drawNumbers(i);
            } else {
                for (int j = size; j > 1; j--) {
                    System.out.print(j + " ");
                }
            }
            Patterns.drawSpace((size - i) * 2 - 1);
            Patterns.drawNumbersRevert(i);

            System.out.println();
        }

    }

    public static void drawTriangleGapWithNumbersTwoSideRevert(int size) {
        for (int i = 1; i <= size; i++) {
            if (i != size) {
                Patterns.drawNumbersRevert(i);
            } else {
                Patterns.drawNumbersRevert(i - 1);
            }
            Patterns.drawSpace((size - i) * 2 - 1);
            Patterns.drawNumbers(i);

            System.out.println();
        }
    }


    public static void drawNumbersPow(int height) {
        for (int i = height - 1; i >= 0; i--) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }

    public static void drawNumbersRevertPow(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }

    public static void drawTriangleWithNumbersTwoSidePow(int size) {
        for (int i = 0; i <= size; i++) {
            Patterns.drawSpace(size - i);
            drawNumbersRevertPow(i);
            drawNumbersPow(i - 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns.drawLine(8);
        drawSquare(7);
        System.out.println();
        System.out.println();
        System.out.println("----------- 1 ----------------------");
        drawZ(7);
        System.out.println();
        System.out.println("------------- 2 --------------------");
        drawX(7);
        System.out.println();
        System.out.println("-------------- 3 -------------------");
        drawXwithFrame(7);
        System.out.println();
        System.out.println("--------------- 4 ------------------");
        drawTriangleWithNumbersTwoSide(8);
        System.out.println();
        System.out.println("---------------- 5 -----------------");
        drawTriangleGapWithNumbersTwoSide(8);
        System.out.println();
        System.out.println("----------------- 6 ----------------");
        drawTriangleGapWithNumbersTwoSideRevert(9);
        System.out.println();
        System.out.println("------------------ 7 ---------------");
        drawTriangleWithNumbersTwoSidePow(8);

    }
}
