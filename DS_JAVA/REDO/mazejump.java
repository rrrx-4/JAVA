
import java.util.*;

public class mazejump {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(1, 1, n, m);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> r = new ArrayList<>();
            r.add("");
            return r;
        }

        ArrayList<String> path = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> path1 = getMazePaths(sr, sc + i, dr, dc);

            for (String p : path1) {
                path.add("h" + i + p);
            }
        }
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> path2 = getMazePaths(sr + i, sc, dr, dc);
            for (String p : path2) {
                path.add("v" + i + p);
            }
        }

        for (int i = 1; i <= Math.min(dc - sc, dr - sr); i++) {
            ArrayList<String> path3 = getMazePaths(sr + i, sc + i, dr, dc);

            for (String p : path3) {
                path.add("d" + i + p);
            }
        }

        return path;

    }

}