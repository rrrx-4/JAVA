import java.util.*;

public class lohisort{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr =new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int lo = scn.nextInt();
        int hi = scn.nextInt();

        sort(arr,lo,hi);

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] sort(int[] a, int lo, int hi){
        int i=0,j=0,k=a.length-1;

        while(i<=k)
        {
            if(a[i]>=lo && a[i] <=hi){
                i++;
            }
            else if(a[i]<=lo)
            {
                int t =a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j++;
            }
            else{
                int tt =a[k];
                a[k] = a[i];
                a[i] = tt;
                k--;
            }
        }
        return a;
    } 
}