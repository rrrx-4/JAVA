import java.util.*;

public class palindrom_substring{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                String s1 = s.substring(i,j);
                if(palindrom(s1))
                {
                    System.out.println(s1);
                }
            }
        }



    }
    public static boolean palindrom(String s1)
    {
        int left =0 ;
        int right = s1.length()-1;
        boolean flag = true;

        while(left < right )
        {
            char l = s1.charAt(left);
            char r = s1.charAt(right);

            if(l!=r)
            {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        return flag ;
    }
}