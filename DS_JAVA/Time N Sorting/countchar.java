import java.util.*;

public class countchar{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        System.out.println(cc(s));
    }

    public static char cc(String s){
        int[] a = new int[26];

        for(int i=0; i<s.length(); i++)
        {
            char t = s.charAt(i) ;

            int c = t - 'a' ;

            a[c]++;
        }
        int te =0;

        for(int i=1 ; i<a.length; i++)
        {
            if(a[te] < a[i]){
                te = i;
            }
        }
        char m =(char)(te + 'a');
        return m;
    }
}


