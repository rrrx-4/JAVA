import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class nofisland {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[][] b = new boolean[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (b[i][j] == false) {
                    ArrayList<Integer> comp = new ArrayList<>();
                    noOfIsland(arr, b, comp, i, j);
                    comps.add(comp);
                }
            }
        }

        System.out.println(comps.size());
    }

    public static void noOfIsland(int[][] arr, boolean[][] b, ArrayList<Integer> comp, int ii, int jj) {
        if (ii >= 0 && ii < arr.length || jj >= 0 && jj > arr[0].length || arr[ii][jj] == 1 || b[ii][jj] == true)
            return;

        comp.add(arr[ii][jj]);
        b[ii][jj] = true;

        noOfIsland(arr, b, comp, ii - 1, jj);

        noOfIsland(arr, b, comp, ii, jj + 1);

        noOfIsland(arr, b, comp, ii + 1, jj);

        noOfIsland(arr, b, comp, ii, jj - 1);
    }

}
