import java.io.*;
import java.util.*;

public class encoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        printEncodings(str,"");
    }

    public static void printEncodings(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);

        if(ch=='0'){
            return ;
        }

        int n = ch -'0';
        char t = (char)(n-1+'a'); 
        printEncodings(str.substring(1), asf+t);

        if(str.length()>1)
        {
            char ch1 = str.charAt(1);
            int n1 = ch1-'0';
            int n2 = n*10+n1;
            if(n2<=26)
            {
                char tt = (char)(n2-1+'a');
                printEncodings(str.substring(2),asf+tt);
            }
        }


     

    }

}