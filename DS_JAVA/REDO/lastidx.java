import java.io.*;
import java.util.*;

public class lastidx {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        int x  = scn.nextInt();
        System.out.println(lastIndex(a,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
        return -1;

       int t = lastIndex(arr, idx+1, x);

       if(arr[idx]!=x)
       {
           return t;
       }
       else if(t >= 0)
       {
           return t;
       }
       else{
           return idx;
       }

    }

}