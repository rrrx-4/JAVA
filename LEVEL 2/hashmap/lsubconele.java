import java.util.*;

public class lsubconele {

    public static int solution(int[] arr) {
        // write your code here

        int ans = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int min = arr[i];
            HashSet<Integer> hs = new HashSet<>();
            hs.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {

                if (hs.contains(arr[j])) {
                    break;
                }
                hs.add(arr[j]);
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);

                if (max - min == j - i) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
