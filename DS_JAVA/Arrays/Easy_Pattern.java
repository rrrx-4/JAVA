import java.util.*;

public class Easy_Pattern{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] a = new int[n][n];
        int c=1;

        for(int i=0; i<n; i++)
        {
            int nc = c;
            
            for(int j=0; j<n; j++)
            {
                System.out.print(nc+" ");
                nc++;
            }
            System.out.println();
            if(n%2==0)
            {
                if(i < n/2-1){
                    c = c+n*2;
                }
                else if(i == n/2-1){
                    c = c+n;
                }
                else{
                    c = c - 2*n;
                }
            }
            else{
                if(i < n/2){
                    c = c + n*2;
                }
                else if(i == n/2){
                    c = c - n;
                }
                else{
                    c = c-2*n;
                }
            }
        }
    }
}