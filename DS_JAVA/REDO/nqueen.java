import java.io.*;
import java.util.*;

public class nqueen {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int i = 0; i < chess.length; i++) {

            if (isQsafe(chess, row, i) == true)

            {
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ",", row + 1);
                chess[row][i] = 0;
            }

        }

    }

    public static boolean isQsafe(int[][] c, int r, int cl) {

        for (int i = r - 1; i >= 0; i--) {
            if (c[i][cl] == 1)
                return false;
        }

        for (int i = r - 1, j = cl - 1; i >= 0 && j >= 0; i--, j--) {
            if (c[i][j] == 1)
                return false;
        }

        for (int i = r - 1, j = cl + 1; i >= 0 && j < c.length; i--, j++) {
            if (c[i][j] == 1)
                return false;
        }

        return true;
    }
}