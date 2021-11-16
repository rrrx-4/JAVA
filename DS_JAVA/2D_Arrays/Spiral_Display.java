import java.util.*;

public class Spiral_Display{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
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
        int maxc = a[0].length-1 ;
        int maxr = a.length-1;
        int minc = 0;
        int minr = 0;
        int count = 1;

        while(count <= m*n)
        {
            for(int i=minr; i<=maxr; i++)
            {
                System.out.println(a[i][minc]);
                count++;
            }
            minc++;
            for(int i=minc; i<=maxc; i++)
            {
                System.out.println(a[maxr][i]);
                count++;
            }
            maxr--;
            for(int i=maxr; i>=minr; i--)
            {
                System.out.println(a[i][maxc]);
                count++;
            }
            maxc--;
            for(int i=maxc; i>=minc; i--)
            {
                System.out.println(a[minr][i]);
                count++;
            }
            minr++;
        }
    



        
    }
}