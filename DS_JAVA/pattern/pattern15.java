/*

for num=5
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1

*/

import java.util.*;

public class pattern15{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in) ;
        int num = scn.nextInt();
        int l = num/2 +1 ;
        int r = l;
        int t =0;
        for(int i=1; i<=num; i++)
        {
            if(i>=(num/2+2))
            {
                t= t-2;
            }
            for(int j=1; j<=num; j++)
            { 
               
                if(l<=j && j<=r)
                {
                    if( i<=num/2+1){
                    if(j<=(num/2+1))
                    {
                        t++;
                    }
                    else
                        t--;
                    }
                    else
                    {
                        
                        if(j<=(num/2+1))
                        {
                            t++;
                        }
                        else
                            t--;   
                    }

                        System.out.print(t+"\t");
                }
                else
                System.out.print("\t");


            }
            if(i < (num/2 +1))
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