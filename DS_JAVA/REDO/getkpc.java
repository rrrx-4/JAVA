import java.util.*;

public class getkpc {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();

            ArrayList<String> ans = getKPC(s);

            System.out.print(ans);
        }

    }

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> b = new ArrayList<>();
            b.add("");
            return b;
        }

        char ch = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> a = getKPC(s);
        ArrayList<String> t = new ArrayList<>();

        String codss = code[ch - '0'];

        for (int i = 0; i < codss.length(); i++) {
            char c = codss.charAt(i);
            for (String tt : a) {
                t.add(c + tt);
            }
        }

        return t;

    }

}
