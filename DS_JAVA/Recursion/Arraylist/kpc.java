import java.io.*;
import java.util.*;

public class kpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> a = getKPC(s);
        System.out.print(a);
    }

    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0)
        {
            ArrayList<String> bsr = new ArrayList<>();

            bsr.add("");
            return bsr;
        }

        char ch = str.charAt(0);
        String ss = str.substring(1);

        ArrayList<String> nc = getKPC(ss);
        ArrayList<String> sa = new ArrayList<>();

        String c = codes[ch-48];

        for(int i=0; i<c.length(); i++)
        {
            char t = c.charAt(i);

            for(String tt: nc)
            {
                sa.add(t+tt);
            }
        }


                return sa;
    }

}