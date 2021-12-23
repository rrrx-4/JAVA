import java.util.*;

public class pkpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        printKPC(s, "");

    }

    public static String[] ch = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char c = str.charAt(0);

        String sb = str.substring(1);

        String codes = ch[c - '0'];

        for (int i = 0; i < codes.length(); i++) {

            char t = codes.charAt(i);
            printKPC(sb, asf + t);
        }
    }

}