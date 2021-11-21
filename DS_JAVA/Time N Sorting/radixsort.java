import java.io.*;
import java.util.*;

public class radixsort {

  public static void radixSort(int[] arr) {
    // write code here 
    int max = arr[0];
    for(int i=1; i<arr.length; i++)   
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    int p =1;
    while(max/p > 0)
    {
        countSort(arr,p);
        p = p*10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    int[] freq = new int[10];
    int[] ans = new int[arr.length];

    for(int i=0; i<arr.length; i++)
    {
        int val = arr[i]/exp %10 ;
        freq[val]++;
    }

    for(int i=1; i<freq.length; i++)
    {
        freq[i] = freq[i]+freq[i-1];
       // freq[i] += freq[i-1];
    }

    for(int i=arr.length-1; i>=0; i--)
    {
        int v = arr[i] /exp % 10 ;
        int p = freq[v];
        ans[p-1] = arr[i];
        freq[v]--;
    }
    for(int i=0; i<arr.length; i++)
    {
        arr[i] = ans[i];
    }

    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}
