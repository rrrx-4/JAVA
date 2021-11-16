import java.util.*;

public class Rotate_90_degree{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }
        int temp ;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                temp = a[i][j];
                a[i][j] = a[j][i] ;
                a[j][i] = temp;
            }
        }

        // int left = 0;
        // int right = a[0].length-1 ;
        for(int i=0; i<a.length; i++)
        {
            int left = 0;
            int right = a[0].length-1 ;
            while(left < right)
            {
                temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}