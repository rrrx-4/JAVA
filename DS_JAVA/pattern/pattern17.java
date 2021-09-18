import java.util.*;

public class pattern17{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int t = num/2 + 1;
        int t2= num -1;

        for(int i=1; i<=num; i++)
        {
            for(int j=1;j<=num; j++)
            {
                if(i<=(num/2 +1))
                {
                if(i==(num/2+1)||((num/2+1)<=j && (j<=t)))
                System.out.print("*\t");
                else
                System.out.print("\t");
                }
                else
                {
                    if((num/2+1)<=j && (j<=t2))
                    System.out.print("*\t");
                    else
                    System.out.print("\t");   
                }

                
            }
            if(i<=(num/2)+1)
            ++t;
            else
            t2--;

            System.out.println();
        }
    }
}