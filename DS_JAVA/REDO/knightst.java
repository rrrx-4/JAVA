import java.io.*;
import java.util.*;

public class knightst {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];

        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int Move) {

        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return;
        }

        if (Move == chess.length * chess.length) {
            chess[r][c] = Move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = Move;
        printKnightsTour(chess, r - 2, c + 1, Move + 1);

        printKnightsTour(chess, r - 1, c + 2, Move + 1);

        printKnightsTour(chess, r + 1, c + 2, Move + 1);

        printKnightsTour(chess, r + 2, c + 1, Move + 1);

        printKnightsTour(chess, r + 2, c - 1, Move + 1);

        printKnightsTour(chess, r + 1, c - 2, Move + 1);

        printKnightsTour(chess, r - 1, c - 2, Move + 1);

        printKnightsTour(chess, r - 2, c - 1, Move + 1);

        chess[r][c] = 0;

    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
