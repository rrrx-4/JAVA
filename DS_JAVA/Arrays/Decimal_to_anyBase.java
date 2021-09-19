import java.util.*;

public class Decimal_to_anyBase{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int p=1;
        int sum=0;
        int mod;

        while(num>0)
        {
            mod = num%base;
            sum = sum+(mod*p);
            p = p*10;
            num = num/base;
        }

        System.out.print(sum);


    }
}