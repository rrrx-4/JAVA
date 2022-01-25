import java.io.*;
import java.util.*;

public class per {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        int l = s.length();
        int f = fac(l);

        for (int i = 0; i < f; i++) {
            int t = i;
            StringBuilder sb = new StringBuilder(s);
            for (int j = l; j >= 1; j--) {
                int q = t / j;
                int r = t % j;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                t = q;

            }
            System.out.println();
        }
    }

    public static int fac(int n) {
        int v = 1;
        for (int i = 2; i <= n; i++) {
            v *= i;
        }

        return v;
    }
}