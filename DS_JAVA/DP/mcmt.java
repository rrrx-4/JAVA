import java.io.*;
import java.util.*;

public class mcmt {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        int[][] st = new int[n][m];

        mcmt(maze, st);

        System.out.println(st[0][0]);

    }

    public static void mcmt(int[][] maze, int[][] st) {
        for (int i = maze.length - 1; i >= 0; i--) {
            for (int j = maze[0].length - 1; j >= 0; j--) {
                if (i == maze.length - 1 && j == maze[0].length - 1) {
                    st[i][j] = maze[i][j];
                } else if (i == maze.length - 1) {
                    st[i][j] = maze[i][j] + st[i][j + 1];
                } else if (j == maze[0].length - 1) {
                    st[i][j] = maze[i][j] + st[i + 1][j];
                } else {
                    st[i][j] = maze[i][j] + Math.min(st[i][j + 1], st[i + 1][j]);
                }
            }
        }
    }

}
