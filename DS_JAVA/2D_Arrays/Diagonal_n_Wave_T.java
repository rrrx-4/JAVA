import java.util.*;

public class Diagonal_n_Wave_T{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }

        for(int t=0; t<2*n; t++)
        {
            int i;
            int j;
            if(t < n-1 ){
                if(t%2==0){
                    i = n-t-1;
                    j = 0;
                }
                else{
                    i = n-1;
                    j = t;
                }

            }
            else if(t >= n){
                if(t%2==0){
                    i =0;
                    j =t-(n-1);
                }
                else{
                    i=2*n-2-t;
                    j=n-1;
                }
            }
            else{
                if(n%2==0){
                i =n-1;
                j =n-1;}
                else{
                    i=0;
                    j=0;
                }
            }

            if(t%2==0){
                while(i<n&&j<n){
                    System.out.println(a[i][j]);
                    i++;
                    j++;
                }
            }
            else{
                while(i>=0&&j>=0)
                {
                    System.out.println(a[i][j]);
                    i--;
                    j--;
                }

            }
        }


    }
}