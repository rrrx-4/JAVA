import java.io.*;
import java.util.*;

public class longpre {

    public static String perbtnt(String p, String t) {
        StringBuilder s = new StringBuilder();

        int min = Math.min(p.length(), t.length());

        for (int i = 0; i < min; i++) {
            if (p.charAt(i) != t.charAt(i)) {
                return s.toString();
            }
            s.append(p.charAt(i));
        }
        return s.toString();

    }

    public static String commonprefix(String[] s, int l) {
        String pre = s[0];
        for (int i = 1; i < l; i++) {
            pre = perbtnt(pre, s[i]);

        }
        return pre;
    }

    public static void main(String[] args) {

        String[] s = { "geeksforgeeks", "geeks", "geek", "geezer" };

        int l = s.length;

        String ans = commonprefix(s, l);

        System.out.println(ans);
    }
}