import java.io.*;
import java.util.*;

public class tog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String sb = scn.nextLine();

        String s = toggle(sb);

        System.out.println(s);
    }

    public static String toggle(String sb) {
        StringBuilder s = new StringBuilder(sb);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char up = (char) (ch - 'a' + 'A');
                s.setCharAt(i, up);
            } else {
                char lc = (char) (ch - 'A' + 'a');
                s.setCharAt(i, lc);
            }
        }

        return s.toString();

    }
}