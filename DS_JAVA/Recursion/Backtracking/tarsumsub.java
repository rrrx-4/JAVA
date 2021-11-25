import java.io.*;
import java.util.*;

public class tarsumsub {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        int t = scn.nextInt();
        printTargetSumSubsets(a,0,"",0,t);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        

        if(sos==tar)
        {
            System.out.println(set+".");
            return;
           
        }
        if(idx ==arr.length)
        return;
    
        
            printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);

            printTargetSumSubsets(arr,idx+1,set,sos,tar);
        
    }

}