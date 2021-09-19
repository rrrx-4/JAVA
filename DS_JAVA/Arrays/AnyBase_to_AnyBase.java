import java.util.*;

public class AnyBase_to_AnyBase{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int base  = scn.nextInt();
            int base2  = scn.nextInt();

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

            num = sum;
            sum=0;
            p=1;

            while(num>0)
            {
                mod = num%base2;
                sum = sum+(mod*p);
                p = p*10;
                num = num/base2;
            }

            System.out.print(sum);


}
}