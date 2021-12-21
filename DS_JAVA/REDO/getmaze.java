import java.util.*;

public class getmaze {

    public static void main(String[] args) throws Exception {

        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            // int[][] a = new int[n][m];
            ArrayList<String> ans = getMazePaths(1, 1, n, m);
            System.out.println(ans);
        }
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if ((sr == dr) && (sc == dc)) {
            ArrayList<String> j = new ArrayList<>();
            j.add("");
            return j;
        } else if (sr > dr || sc > dc) {
            ArrayList<String> jj = new ArrayList<>();
            return jj;
        }

        ArrayList<String> col = getMazePaths(sr, sc + 1, dr, dc);

        ArrayList<String> row = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> maze = new ArrayList<>();

        for (String s : col) {
            maze.add('h' + s);
        }
        for (String s : row) {
            maze.add('v' + s);
        }

        return maze;
    }

}