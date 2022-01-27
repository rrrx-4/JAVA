import java.io.*;
import java.util.*;

public class pdub {
    public static void main(String[] args) {
        String s = "java and javascript";

        int l = s.length();
        int[] a = new int[256];

        for (int i = 0; i < l; i++) {
            a[s.charAt(i)]++;
        }

        for (int i = 0; i < l; i++) {
            if (a[s.charAt(i)] > 1) {
                if (s.charAt(i) != ' ')
                    System.out.println(s.charAt(i));
                a[s.charAt(i)] = 0;
            }
        }
    }
}