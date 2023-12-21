import java.util.ArrayList;
import java.util.Scanner;

public class TicTAcToe {
    public static void main(String[] args) {
        String[][] table = {{"|   ", "|   ", "|   ", "|"}, {"|   ", "|   ", "|   ", "|"}, {"|   ", "|   ", "|   ", "|"}};
        String player = "X";
        int row = -1;
        int col = -1;
        printTable(table, player, row, col);//pradine lentele
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {

            System.out.println();

            System.out.print("Enter a row (0,1,2) for player " + player + ": ");
            row = Integer.parseInt(scan.nextLine());
            System.out.print("Enter a column (0,1,2) for player " + player + ": ");
            col = Integer.parseInt(scan.nextLine());
            while (table[row][col].contains("x") || table[row][col].contains("o")) {
                System.out.println();
                System.out.println("\tERROR!!");
                System.out.println("\tThis place is not empty,\n\tEnter valid numbers and continue game:");
                System.out.println();
                System.out.print("Enter a row (0,1,2) for player " + player + ": ");
                row = Integer.parseInt(scan.nextLine());
                System.out.print("Enter a column (0,1,2) for player " + player + ": ");
                col = Integer.parseInt(scan.nextLine());
            }

            printTable(table, player, row, col);
            int winner = whoIsWinner(table, row, col);
            if (winner == -1) {
                System.out.println();
                System.out.println("Winner is player X!\n\n\tC O N G R A T U L A T I O N ! ! !");
                break;
            } else if (winner == -2) {
                System.out.println();
                System.out.println("Winner is player O!\n\n\tC O N G R A T U L A T I O N ! ! !");
                break;
            }
            player = player.equals("O") ? "X" : "O";

        }
        if (whoIsWinner(table, row, col) == 0) {
            System.out.println("Nobody won, play again!");
        }
    }

    public static void drawHorizontalLine() {
        for (int i = 0; i < 14; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static int whoIsWinner(String[][] table, int row, int col) {
        if (table[0][0].contains("x") && table[0][1].contains("x") && table[0][2].contains("x") ||
                table[1][0].contains("x") && table[1][1].contains("x") && table[1][2].contains("x") ||
                table[2][0].contains("x") && table[2][1].contains("x") && table[2][2].contains("x") ||
                table[0][0].contains("x") && table[1][1].contains("x") && table[2][2].contains("x") ||
                table[2][0].contains("x") && table[1][1].contains("x") && table[0][2].contains("x") ||
                table[0][0].contains("x") && table[1][0].contains("x") && table[2][0].contains("x") ||
                table[0][1].contains("x") && table[1][1].contains("x") && table[2][1].contains("x") ||
                table[0][2].contains("x") && table[1][2].contains("x") && table[2][2].contains("x")) {

            return -1;

        } else if (table[0][0].contains("o") && table[0][1].contains("o") && table[0][2].contains("o") ||
                table[1][0].contains("o") && table[1][1].contains("o") && table[1][2].contains("o") ||
                table[2][0].contains("o") && table[2][1].contains("o") && table[2][2].contains("o") ||
                table[0][0].contains("o") && table[1][1].contains("o") && table[2][2].contains("o") ||
                table[2][0].contains("o") && table[1][1].contains("o") && table[0][2].contains("o") ||
                table[0][0].contains("o") && table[1][0].contains("o") && table[2][0].contains("o") ||
                table[0][1].contains("o") && table[1][1].contains("o") && table[2][1].contains("o") ||
                table[0][2].contains("o") && table[1][2].contains("o") && table[2][2].contains("o")) {


            return -2;

        } else {
            return 0;
        }
    }

    public static void printTable(String[][] table, String player, int row, int col) {
        drawHorizontalLine();
        if (row == -1 && col == -1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(table[i][j]);
                }
                System.out.println();
                drawHorizontalLine();
            }
        } else if (player.equals("X")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    table[row][col] = "| x ";
                    System.out.print(table[i][j]);
                }
                System.out.println();
                drawHorizontalLine();
            }
        } else if (player.equals("O")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    table[row][col] = "| o ";
                    System.out.print(table[i][j]);
                }
                System.out.println();
                drawHorizontalLine();
            }
        }
    }

}
