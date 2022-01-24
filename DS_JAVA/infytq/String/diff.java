import java.util.*;
import java.io.*;

public class diff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        String a = charDiff(s);

        System.out.println(a);
    }

    public static String charDiff(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i - 1);
            int d = ch1 - ch2;
            sb.append(d);
            sb.append(ch1);

        }

        return sb.toString();
    }
}