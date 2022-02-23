import java.io.*;
import java.util.*;

public class ngetr2 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        s.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (s.size() > 0 && arr[i] > arr[s.peek()]) {
                int v = s.pop();
                ans[v] = arr[i];
            }

            s.push(i);
        }

        while (s.size() > 0) {
            ans[s.pop()] = -1;
        }

        return ans;

    }

    // public static int[] solve(int[] arr){
    // // solve
    // int[] ans = new int[arr.length];
    // Stack<Integer> s = new Stack<>();

    // ans[arr.length-1] = -1;
    // s.push(arr[arr.length-1]);

    // for(int i=arr.length-2; i>=0; i--)
    // {
    // if(s.peek()<arr[i])
    // {
    // while(s.size()>0 && s.peek()<arr[i])
    // {
    // s.pop();
    // }

    // if(s.size()>0 && s.peek()>arr[i])
    // {
    // ans[i] = s.peek();
    // s.push(arr[i]);
    // }
    // else{
    // ans[i] = -1;
    // s.push(arr[i]);
    // }
    // }
    // else{
    // ans[i] = s.peek();
    // s.push(arr[i]);
    // }
    // }

    // return ans ;

    // }

}
