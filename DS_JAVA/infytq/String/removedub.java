import java.io.*;
import java.util.*;

public class removedub {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int[] a = new int[256];
        StringBuilder ans = new StringBuilder("");

        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (a[s.charAt(i)] == 0) {
                a[s.charAt(i)] = 1;
                ans.append(s.charAt(i));
            }
        }

        System.out.println(ans.toString());
    }
}