import java.io.*;
import java.util.*;

public class hfc2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);

            if (hm.containsKey(t)) {
                int v = hm.get(t);
                hm.put(t, v + 1);
            } else {
                int c = 0;
                hm.put(t, c);
            }
        }
        int m = 0;
        char ans = ' ';
        Set<Character> keys = hm.keySet();

        for (char a : keys) {
            if (hm.get(a) > m) {
                m = hm.get(a);
                ans = a;
            }

        }

        System.out.println(ans);
    }

}
