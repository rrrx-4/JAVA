import java.util.*;
import java.io.*;

public class comp {

    public static String comp1(String s) {
        String a = "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                a += s.charAt(i);
            }
        }
        a += s.charAt(s.length() - 1);

        return a;
    }

    public static String comp2(String s) {
        String a = "";
        int c = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                c++;
            } else {

                a += s.charAt(i);
                if (c > 1)
                    a += c;

                c = 1;
            }
        }
        a += s.charAt(s.length() - 1);
        if (c > 1)
            a += +c;

        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(comp1(str));

        System.out.println(comp2(str));
    }
}
