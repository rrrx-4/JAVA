import java.io.*;
import java.util.*;

public class maxocc {
    public static void main(String[] args) {
        String s = "samplereeee string";

        int a[] = new int[256];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            a[s.charAt(i)]++;
        }

        int max = -1;
        char aa = ' ';

        for (int i = 0; i < l; i++) {
            if (max < a[s.charAt(i)]) {
                max = a[s.charAt(i)];
                aa = s.charAt(i);
            }
        }

        System.out.println(aa);
    }
}