import java.io.*;
import java.util.*;

public class count_e {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            char a = s.charAt(i - 1);

            char chim1 = s.charAt(i - 2);

            String last = s.substring(i - 2, i);

            if (a != '0') {
                dp[i] = dp[i - 1];

            }
            if (chim1 != '0' && Integer.parseInt(last) <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        System.out.println(dp[s.length()]);

    }
}