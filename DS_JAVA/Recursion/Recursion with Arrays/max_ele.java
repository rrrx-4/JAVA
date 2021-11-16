import java.io.*;
import java.util.*;

public class max_ele {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){

        if(idx == arr.length -1)
        return arr[idx];

      //  if(idx == arr.length)
      // return 0;


        int misa = maxOfArray(arr,idx+1);   

        if(misa > arr[idx])                 
        return misa;                        
        else
        return arr[idx];                    
    }

}