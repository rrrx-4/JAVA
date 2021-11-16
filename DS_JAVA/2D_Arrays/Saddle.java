import java.util.*;

public class Saddle{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] a = new int[n][n];

        for(int i=0; i<a,length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<a.length; i++)
        {
            int min = a[i][0];
            int id = 0;

            for(int j=1; j<a[0].length; j++)
            {
                if(a[i][j] < min)
                {
                    min = a[i][j];
                    id = j;

                }
            }
            boolean issaddle = true;
            for(int k=0; k<a.length; k++)
            {
                if(a[k][id] > min)
                {
                    issaddle = false ;
                    break;
                }

            }

            if(issaddle==true)
            {
                System.out.println(min);
                return ;
            }

        }
        System.out.println("Invalid input");
    }
}