import java.util.*;
public class wakanda1{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int a[][] = new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            if(i%2==0){
            for(int j=0; j<m; j++)
            {
                System.out.println(a[j][i]);
            }
        }
        else
        {
            for(int j=m-1; j>=0; j--)
            {
                System.out.println(a[j][i]);
            }
        }
        }
    }
}
