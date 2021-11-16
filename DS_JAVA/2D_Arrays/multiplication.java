import java.util.*;

public class multiplication{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int m1 = scn.nextInt();
        int n1 = scn.nextInt();
        int a[][] = new int [m1][n1];

        for(int i=0; i<m1; i++)
        {
            for(int j=0; j<n1; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }

        int m2 = scn.nextInt();
        int n2 = scn.nextInt();
        int b[][] = new int [m2][n2];

        for(int i=0; i<m2; i++)
        {
            for(int j=0; j<n2; j++)
            {
                b[i][j] = scn.nextInt();
            }
        }

        if(n1!=m2)
        {
            System.out.print("Invalid input");
        }
        else{
            int c[][] = new int[m1][n2];
            int sum=0;

            for(int i=0; i<m1; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    sum=0;
                    for(int k=0; k<m2; k++)
                    {
                        sum += (a[i][k] * b[k][j]);
                        // c[i][j] = sum;
                        
                    }
                   c[i][j] = sum;
                }
            }
            for(int i=0; i<m1; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}