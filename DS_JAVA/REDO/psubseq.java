import java.io.*;
import java.util.*;

public class psubseq {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printSS(s, "");
    }

    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        String ss = str.substring(1);

        printSS(ss, ans + ch);

        printSS(ss, ans);

    }

}
