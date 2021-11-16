import java.util.*;

public class Ring{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int a[][] = new int[m][n] ;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        int[] oned =  make1darray(a,s);
        rotate(oned,r);
        make2darray(oned,a,s);
        display(a);


    }


    public static void make2darray(int[] oned, int[][] a, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length -s;
        int maxc = a[0].length -s;
        int count = 0;

        for(int i=minr, j=minc;i<=maxr; i++)
        {
            a[i][j] = oned[count];
            count++;
        }
        minc++;

        for(int i=minc, j=maxr; i<=maxc; i++)
        {
            a[j][i] = oned[count];
            count++;
        }
        maxr--;

        for(int i=maxr,j=maxc; i>=minr; i--)
        {
            a[i][j] = oned[count];
            count++;
        }
        maxc--;

        for(int i=maxc, j=minr; i>=minc; i--)
        {
            a[j][i] = oned[count];
            count++; 
        }
        minr++;
    }

        public static int[] make1darray(int[][] a, int s)
        {
            int minr = s-1 ;
            int minc = s-1 ;
            int maxr = a.length - s;
            int maxc = a[0].length - s;

            int sz = (2 * (maxr- minr +1)) + (2 *(maxc -minc +1)) -4 ;

            int[] oned = new int[sz] ;
            int count = 0;

            for(int i=minr, j=minc; i<=maxr; i++)
            {
                oned[count] = a[i][j];
                count++;
            }
            minc++;

            for(int i=minc, j=maxr; i<=maxc; i++)
            {
                oned[count] = a[j][i];
                count++;
            }
            maxr--;

            for(int i=maxr, j=maxc; i>=minr; i--)
            {
                oned[count] = a[i][j];
                count++;
            }
            maxc--;

            for(int i=maxc, j=minr; i>=minc; i--)
            {
                oned[count] = a[j][i];
                count++;
            }
            minr++;

            return oned ;
        }

    public static void rotate(int[] oned, int r ){
        int left = 0;
        int right = oned.length -1;

        r = r % oned.length ;
        if(r<0)
        {
            r = r+oned.length;
        }

        reverse(oned, left, right-r);
        reverse(oned, right-r+1, right);
        reverse(oned, left, right);
    }

    public static void reverse(int[] oned, int l, int r){
        while(l<r)
        {
            int temp = oned[l] ;
            oned[l] = oned[r];
            oned[r] = temp;

            l++;
            r--;

        }
    }

    public static void display(int[][] twod){
        for(int i=0; i<twod.length; i++)
        {
            for(int j=0; j<twod[0].length; j++)
            {
                System.out.print(twod[i][j]+" ");
            }
            System.out.println();
           

        }
    }
}