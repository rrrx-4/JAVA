import java.util.*;

public class polyno{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(poly(x,n));
    }

    public static int poly(int x, int n){

        int sum = 0; 
        int p =1 ;
        for(int i=n; i>=1; i--)
        {
        p = p*x;

        sum = (i*p) + sum ;
    }
    return sum;
    }
}