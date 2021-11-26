import java.util.*;

public class soe{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // 1st make boolean array of size n+1 to store value from 0 to n .... value of all the elenments is false...
        boolean[] a = new boolean[n+1];
        //only need to check until root of n i.e if n=36 only check until 6...
        for(int i=2; i*i<a.length; i++)
        {
           // it starts from 2 and make element true  if that element it comes in his table..
            if(a[i]==false)
            {
                // sieve of eratosthenes-- make true elemets which comes in table
                for(int ja=2; ja*i<a.length; ja++)
                {
                    a[ja*i] = true;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==false)
            {
                System.out.println(i);
            }
        }
    }
}