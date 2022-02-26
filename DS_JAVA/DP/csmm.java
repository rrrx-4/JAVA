import java.io.*;
import java.util.*;

public class csmm {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Integer[] st = new Integer[n + 1];

        st[n] = 0;

        csmm(arr, st);

        System.out.println(st[0]);
    }

    public static void csmm(int[] arr, Integer[] st) {

        for (int i = arr.length - 1; i >= 0; i--) {
            // Integer min = null;
            int min = Integer.MAX_VALUE;

            for (int j = i + 1; j <= i + arr[i]; j++) {

                if (j < st.length) {
                    if (st[j] != null) {
                        min = Math.min(st[j], min);
                        st[i] = min + 1;
                    }

                }

            }
        }
    }

}