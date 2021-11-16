import java.io.*;
import java.util.*;

public class logarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){

        if(n==0)
        return 1;

        int n2 = power(x,n/2);
        int n22 = n2*n2;
        return n22;
    }

}