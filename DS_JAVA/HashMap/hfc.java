import java.io.*;
import java.util.*;

public class hfc {

    public static void main(String[] args) throws Exception {
        // write your code here

        String s = "zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc";
        HashMap<String, Integer> str = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            String k = s.charAt(i) + "";

            if (str.containsKey(k)) {
                int g = str.get(k);
                str.put(k, g + 1);
            } else
                str.put(k, 1);
        }

        int max = Integer.MIN_VALUE;
        String ans = " ";
        Set<String> keys = str.keySet();
        for (String key : keys) {
            if (max < str.get(key)) {
                max = str.get(key);
                ans = key;
            }
        }

        System.out.println(ans);
    }

}