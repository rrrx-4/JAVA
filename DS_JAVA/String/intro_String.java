import java.util.*;

public class intro_String{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s =  "Hello World" ;

        String ss = scn.nextLine();
        
        System.out.println(s.substring(1,4));
        System.out.println(ss);
        System.out.println(s.length());


        for(int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));

        }

        
    }
}