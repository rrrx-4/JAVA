import java.util.*;

public class insertion{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }

        for(int i=1; i<a.length; i++)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(a[j+1]<a[j]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for(int v : a)
        {
            System.out.println(v);
        }
    }
}