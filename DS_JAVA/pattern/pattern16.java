import java.util.*;

public class pattern16{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int l = 1;
        int r = (num*2)-1;

        for(int i=1; i<=num; i++)
        {
            int t=1;
            int t2=i;
            if(i==num)
            {
                t2 = i -1;
            }
            for(int j=1; j<=(2*num -1); j++)
            {
                if(j<=l) //(|| j>=r)
                {
                    //if(j<=(num/2+1)){
                    System.out.print(t+"\t");
                    t++;
                //}
                /*
                    else
                    {
                        System.out.print(t2+"\t");
                        t2--;

                    }*/

                }
                else if(j>=r)
                {
                    System.out.print(t2+"\t");
                    t2--;

                }
                else
                System.out.print("\t");
            }
            l++;
            r--;
            System.out.println();
        }
    }
}