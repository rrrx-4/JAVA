/*
for num = 4 , its nCr problem.

1
1       1
1       2       1
1       3       3       1
1       4       6       4       1



*/ 


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