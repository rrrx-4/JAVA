
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            int c = 1;
            int c2 = n*(n-1) - n +1;
            if(n%2==0)
            {
                c2 = n*(n-1)+1;
            }
        int[][] a = new int[n][n] ;
        
        for(int i=0; i<n; i++)
        {
           if(n%2!=0) {
            if(i <= n/2)
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = c;
                    c++;
                }
                c= c+n ;
            }
            else
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = c2;
                    c2++;
                }
                c2= c2-n*3 ;

            }
        }
        else{

            if(i < n/2)
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = c;
                    c++;
                }
                c= c+n ;
            }
            else
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = c2;
                    c2++;
                }
                c2= c2-n*3 ;

            }
        }
    }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}