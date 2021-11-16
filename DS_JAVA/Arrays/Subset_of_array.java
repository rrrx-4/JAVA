<<<<<<< HEAD
import java.util.*;

public class Subset_of_array{
    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n] ;
        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        int result = 1 << n ;
        
        int[] a1 = new int[n];
       for(int i=0; i<result; i++)
       {
           int ans = binary(i);
           for(int j=n-1; j>=0; j--)
           {
               int bit = ans%10;
               a1[j] = bit;
               ans = ans/10;
           }

           for(int k=0; k<n; k++)
           {
               if(a1[k] > 0)
               {
                   System.out.print(a[k] + " ");
               }
               else
               {
                   System.out.print("- ");
               }
           }
           System.out.println();


       }


    }

    public static int binary(int b)
    {
        int p = 1;
        int sum = 0;
        int m;

        while(b>0)
        {
            m = b%2;             //   1 7 1 10 1 3 11 100 1 1 111 1000 1 0 1111 10000
            b = b/2;
            sum = sum+(m*p);
            p = p*10;
        }
        return sum ;
    }
=======
import java.util.*;

public class Subset_of_array{
    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n] ;
        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        int result = 1 << n ;
        
        int[] a1 = new int[n];
       for(int i=0; i<result; i++)
       {
           int ans = binary(i);
           for(int j=n-1; j>=0; j--)
           {
               int bit = ans%10;
               a1[j] = bit;
               ans = ans/10;
           }

           for(int k=0; k<n; k++)
           {
               if(a1[k] > 0)
               {
                   System.out.print(a[k] + " ");
               }
               else
               {
                   System.out.print("- ");
               }
           }
           System.out.println();


       }


    }

    public static int binary(int b)
    {
        int p = 1;
        int sum = 0;
        int m;

        while(b>0)
        {
            m = b%2;             //   1 7 1 10 1 3 11 100 1 1 111 1000 1 0 1111 10000
            b = b/2;
            sum = sum+(m*p);
            p = p*10;
        }
        return sum ;
    }
>>>>>>> 64f5693cec574fdcbbacfcdfa140f52c8524e504
}