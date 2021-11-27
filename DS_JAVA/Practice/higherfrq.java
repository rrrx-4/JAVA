// In given string we have find maximum frequency character...
import java.util.*;
public class higherfrq{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        // create function which will return maximmum freq char
        char ans = hf(s);
        System.out.println(ans);
    }

    public static char hf(String s)
    {
        // this string is contain between 'a'to'z' therefore for creating array of size 26  
        int[] a = new int[26];
        // itreate over the string 
        for(int i=0; i<s.length(); i++)
        {
            char tt = s.charAt(i);
            //converting char into integer from
            int  t = tt - 'a' ;
            //incerasing value of that (integer)index
            a[t]++;
        }
        int max = 0;
        //looping over array 
        for(int i=1; i<a.length; i++)
        {   
            //finding maximum value 
            if(a[max]<a[i])
            //updating maximum value INDEX
               max=i;
        }
        //converting integer into character...
        return (char)(max+'a');
    }
}
