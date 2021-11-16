import java.util.*;

public class merge {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        a = merge(a,0,a.length-1);

        for(int v : a)
        {
            System.out.println(v);
        }
    }

    public static int[] merge(int[] a, int l, int h)
    {
        if(l==h)
        {
            int[] t = new int[1];
            t[0] = a[h];
            return t;
        }
        int m = (h+l)/2 ;

        int[] fa = merge(a,l,m);
        int[] sa = merge(a,m+1,h);

        int[] fna = mta(fa,sa);

        return fna;
    }

    public static int[] mta(int[] a, int[] b)
    {
        int[] c = new int[a.length+b.length];

        int i=0,j=0,k=0;

        while(i < a.length && j < b.length)
        {
            if(a[i]>b[j])
            {
                c[k]=b[j];
                k++;
                j++;
            }else{
                c[k] = a[i];
                k++;
                i++;
            }
        }

        if(i == a.length)
        {
            while(j < b.length)
            {
                c[k] = b[j];
                k++;
                j++;
            }
        }else{
            while(i < a.length)
            {
                c[k]=a[i];
                k++;
                i++;
            }
        }

        return c;
    
    }
}