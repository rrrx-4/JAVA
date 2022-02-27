import java.io.*;
import java.util.*;

public class goldmine {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] st = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            st[i][arr[0].length - 1] = arr[i][arr[0].length - 1];
        }

        goldmine(arr, st);
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            max = Math.max(max, st[j][0]);
            // System.out.println(st[j][0]);
        }

        System.out.println(max);
    }

    public static void goldmine(int[][] arr, int[][] st) {
        int[][] dir = {
                { -1, +1 },
                { 0, 1 },
                { 1, 1 }
        };

        for (int j = arr[0].length - 2; j >= 0; j--) {
            for (int i = arr.length - 1; i >= 0; i--) {
                int min = Integer.MIN_VALUE;
                for (int d = 0; d < 3; d++) {
                    int a = dir[d][0];
                    int b = dir[d][1];
                    a = i + a;
                    b = j + b;
                    if (a >= 0 && a < arr.length && b >= 0 && b < arr[0].length)
                        min = Math.max(st[a][b], min);
                }
                st[i][j] = min + arr[i][j];

            }
        }

    }
}