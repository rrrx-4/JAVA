import java.io.*;
import java.util.*;

public class fib1 {

    public static void main(String[] args) throws Exception {
        // write your code here\

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] st = new int[n + 1];

        System.out.println(fib(n, st));
    }

    public static int fib(int n, int[] st) {
        if (n == 1 || n == 0)
            return n;

        if (st[n] != 0)
            return st[n];

        int n1 = fib(n - 1, st);
        int n2 = fib(n - 2, st);

        int sum = n1 + n2;

        st[n] = sum;

        return sum;
    }

}