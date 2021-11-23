import java.io.*;
import java.util.*;

public class flood {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        boolean[][] t = new boolean[n][m];
        floodfill(arr, 0, 0, "",t);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] t) {

        if(sr == maze.length || sc ==maze[0].length || sr ==-1 || sc == -1 || maze[sr][sc]==1|| t[sr][sc]==true )
        {
            return;
        }
        if(sr==maze.length-1 && sc==maze[0].length-1)
        {
            System.out.println(asf);
        }

        t[sr][sc]= true ;

            floodfill(maze,sr-1,sc,asf+"t",t);

            floodfill(maze,sr,sc-1,asf+"l",t);

            floodfill(maze,sr+1,sc,asf+"d",t);

            floodfill(maze,sr,sc+1,asf+"r",t);

            t[sr][sc] = false ;


    
    }
}
