import java.io.*;
import java.util.*;

public class compression {

	public static String compression1(String str){
		// write your code here
        String s = "";
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {
                s= s+str.charAt(i);
            }
        }
	
        s= s+str.charAt(str.length()-1);
		return s;
	}

	public static String compression2(String str){
		// write your code here
        String s = "";
        int c= 1;


        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                c++;
            }
            else{
                s = s+str.charAt(i);
                if(c>1)
                {
                    s = s+c ;
                    c =1;
                }
            }
        }

        s= s+str.charAt(str.length()-1);
        if(c>1)
        {
            s = s+c;
        }

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}