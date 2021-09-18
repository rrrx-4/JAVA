import java.util.* ;

public class pattern13{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
    
        for(int i=0; i<num; i++)
        {
            int t =1;
            for(int j=0; j<=i; j++)
            {
                
                System.out.print(t + "\t");

                 int t1 = t*(i-j)/(j+1) ;
                 t =t1;
                
            }
            
            System.out.println();
        }
        
    }
}