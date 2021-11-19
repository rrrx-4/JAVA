import java.io.*;
import java.util.*;

public class str_comp {

	public static String compression1(String str){
		// write your code here
        String a = "";

        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==str.charAt(i+1)){

            }
            else{
                a = a+str.charAt(i);
            }
        }

        a = a+str.charAt(str.length()-1);
        return a;

		
	}

	public static String compression2(String str){
		// write your code here

        String a ="";
        int c=1;
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i-1)== str.charAt(i)){
                c++;
            }
            else
            {
                if(c > 1){
                    a = a+str.charAt(i-1)+c;
                    c=1;
                }
                else{
                    a =a+str.charAt(i-1);
                }
            }
        }
        a= a+str.charAt(str.length()-1);
        if(c>1)
        a= a+c;

		return a;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}