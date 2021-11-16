import java.io.*;
import java.util.*;

public class kpc {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String n = scn.nextLine();

        printKPC(n,"");

    }

    public static String[] c = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        

        char ch = str.charAt(0);

        String su = str.substring(1);

        String c1 = c[ch-48];

        for(int i=0; i<c1.length(); i++)
        {
            char a = c1.charAt(i);

            printKPC(su,asf+a);
        }
    }

}