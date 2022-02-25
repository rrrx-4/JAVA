import java.io.*;
import java.util.*;

public class cs {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int s = scn.nextInt();

        int[] st = new int[s + 1];
        int[] st1 = new int[s + 1];

        System.out.println(stairstab(s, st1));
    }

    public static int stairs(int s, int[] st) {

        if (s == 0)
            return 1;

        if (s < 0)
            return 0;

        if (st[s] != 0)
            return st[s];

        int a = stairs(s - 1, st);
        int b = stairs(s - 2, st);
        int c = stairs(s - 3, st);

        int sum = a + b + c;
        st[s] = sum;

        return sum;
    }

    public static int stairstab(int s, int[] st1) {
        st1[0] = 1;

        for (int i = 1; i <= s; i++) {
            if (i - 1 >= 0) {
                st1[i] += st1[i - 1];
            }

            if (i - 2 >= 0) {
                st1[i] += st1[i - 2];
            }

            if (i - 3 >= 0) {
                st1[i] += st1[i - 3];
            }

        }

        return st1[s];
    }

}
