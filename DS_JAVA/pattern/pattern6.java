/*

for num=5

*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *


*/



import java.util.*;

public class pattern6{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int l = (num+2)/2 +1;
        int r = (num+2)/2 +1;


        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num+2; j++)
            {
                if(l<=j && j<=r)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }

            }
            if(i<num/2+1)
            {
                l--;
                r++;
            }
            else
            {
                l++;
                r--;
            }
            System.out.println();
        }
    }
}