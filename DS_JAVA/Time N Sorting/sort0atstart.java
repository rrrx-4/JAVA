import java.util.*;

public class sort0atstart{
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
        
  
        //output is 0000 ....

        int k = a.length-1;
        int l=a.length-1;

        while(k>0){
            if(a[k]==0)
            {
                k--;
            }
            else{
                int tt = a[k];
                a[k] = a[l];
                a[l] = tt;
                k--;
                l--;
            }
        }


        for(int ii=0; ii<n; ii++)
        {
            System.out.println(a[ii]);
        }
    }
}