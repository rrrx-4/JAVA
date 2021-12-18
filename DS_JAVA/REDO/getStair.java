import java.util.*;

public class getStair {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        } else if (n < 0) {
            return new ArrayList<String>();
        }

        ArrayList<String> path1 = getStairPaths(n - 1);

        ArrayList<String> path2 = getStairPaths(n - 2);

        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> path = new ArrayList<>();

        for (String s : path1) {
            path.add(1 + s);
        }

        for (String s : path2) {
            path.add(2 + s);
        }

        for (String s : path3) {
            path.add(3 + s);
        }

        return path;
    }

}