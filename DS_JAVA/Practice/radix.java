import java.util.*;





public class radix{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        radixSort(a);
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void countsort(int[] a, int p){
        int[] r = new int[10];
        int[] ans = new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            int v = a[i]/p%10 ;
            r[v]++;
        }
        for(int i=1; i<r.length; i++)
        {
            r[i]+=r[i-1];
        }
        for(int i=a.length-1; i>=0; i-- )
        {
            int v1 = a[i]/p%10;
            int a1 = r[v1];
            ans[a1-1] = a[i];
            r[v1]--;

        }
        for(int i=0; i<a.length; i++)
        {
            a[i] = ans[i];
        }
    }

    public static void radixSort(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++)
        {
            if(max < a[i])
            max = a[i];
        }
     int p = 1; 
     while(max/p > 0)
     {
         countsort(a,p);
         p = p*10;
     }
    
    }
}