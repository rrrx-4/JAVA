import java.util.*;

public class anyBase_to_Decimal{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int base  = scn.nextInt();

            int mod;
            int p=1;
            int sum=0;

            while(num>0)
            {
                mod = num%10 ;
                sum = sum + (mod*p);
                p = p*base;
                num = num/10;

            }
            System.out.print(sum);
    }
}