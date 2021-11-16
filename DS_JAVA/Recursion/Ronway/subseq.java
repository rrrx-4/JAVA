import java.io.*;
import java.util.*;

public class subseq {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSS(str,"");
    }

    public static void printSS(String str, String ans) {

        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);          1

        String su = str.substring(1);    1



        printSS(su,ans+ch); // for Selection 2
        printSS(su,ans); // for rejection  3
    }

}