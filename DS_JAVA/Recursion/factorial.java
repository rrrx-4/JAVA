import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){

        if(n==0)
        return 1;

        int sf = factorial(n-1);
        int sf2 = sf*n;

        return sf2 ;
    }

}