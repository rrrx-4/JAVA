import java.io.*;
import java.util.*;

public class getsubs {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        ArrayList<String> s1 = gss(s);

        
            System.out.println(s1);
        
    }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0)
        {
            ArrayList<String> r = new ArrayList<>();
            r.add("");
            return r;
        }

        char ch = str.charAt(0);
        String s = str.substring(1);
       
        ArrayList<String> ans = gss(s);
        ArrayList<String> t = new ArrayList<>();

        for(String s1 : ans)
        {
            t.add(s1);
        }
        for(String s2 : ans)
        {
            t.add(ch+s2);
        }
        return t;
    }

}