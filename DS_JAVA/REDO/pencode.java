import java.io.*;
import java.util.*;

public class pencode {

    public static void main(String[] args) throws Exception {

        try (Scanner scn = new Scanner(System.in)) {
            String s = scn.next();

            printEncodings(s, "");
        }
    }

    public static void printEncodings(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        int t1 = ch - '0';
        char ach = (char) ('a' + t1 - 1);

        String sb = str.substring(1);
        printEncodings(sb, asf + ach);

        if (str.length() >= 2) {
            char ch2 = str.charAt(1);
            int t2 = ch2 - '0';
            int at = t1 * 10 + t2;
            if (at <= 26) {
                char a2ch = (char) ('a' + at - 1);
                String sb2 = str.substring(2);
                printEncodings(sb2, asf + a2ch);
            }

        }

    }

}