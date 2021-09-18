import java.util.* ;

public class pattern18{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int l = 1;
        int r=  num;
        int l1 =num/2;

    
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num; j++)
            {
                if(i<=num/2+1){

                    
                 if(j>=l && j<=r)
                {
                    System.out.print("*\t");

                }
               


                else{

                System.out.print("\t");}

                 if(i<1 && i<num/2)
                {
                    if(j==l || j==r)
                    System.out.print("\t");
                }

            }
                else
                {
                    if(j>=l && j<=r)
                {
                    System.out.print("*\t");

                }
                else{

                System.out.print("\t");} 
                }
            }
            if(i<num/2+1)
            {
                l++;
                r--;
            }
            else
            {
                l--;
                r++;
            }
            
            System.out.println();
        }
        
    }
}