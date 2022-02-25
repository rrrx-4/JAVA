import java.io.*;
import java.util.*;

public class cvj {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] st = new int[n + 1];

        System.out.println(st[0]);
    }

    public static void csvj(int[] arr, int[] st) {

        st[arr.length] = 1;

        for (int i = arr.length - 1; i >= 0; i++) {
            int t = arr[i];
            int sum = 0;
            // st[i] = 0;
            for (int j = i + 1; j <= i + t; i++) {
                sum += st[j];
            }

            st[i] = sum;
        }

        // return sum ;

    }

}