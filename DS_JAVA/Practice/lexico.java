import java.util.*;

public class lexico{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();

        for(int i=1; i<=9; i++)
        {
            lexi(n,i);
        }
    }

    public static void lexi(int n, int i){

        if(i>n)
        return;

        System.out.println(i);
        for(int j=0; j<10; j++)
        {
            lexi(n,i*10+j);
        }
    }
}