import java.util.*;

public class sort0atend{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        int b[] = a ;
        
        int i=0,j=0;
        // output is ....0000
        while(i<a.length)
        {
            if(a[i]!=0)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        //output is 0000 ....

        int k = b.length-1;
        int l=b.length-1;

        while(k>0){
            if(b[k]==0)
            {
                k--;
            }
            else{
                int tt = b[k];
                b[k] = b[l];
                b[l] = tt;
                k--;
                l--;
            }
        }


        for(int ii=0; ii<n; ii++)
        {
            System.out.println(a[ii]);
        }

        for(int ii=0; ii<n; ii++)
        {
            System.out.println(b[ii]);
        }
    }
}