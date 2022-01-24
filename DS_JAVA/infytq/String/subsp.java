import java.util.*;
import java.io.*;

public class subsp {

    public static boolean isplan(String s) {
        boolean flag = true;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                return flag;
            }
            i++;
            --j;
        }

        return flag;
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        String ip = s1.nextLine();

        for (int i = 0; i < ip.length(); i++) {
            for (int j = i + 1; j <= ip.length(); j++) {
                String s = ip.substring(i, j);

                boolean b = isplan(s);

                if (b) {
                    System.out.println(s);
                }
            }
        }
    }
}
