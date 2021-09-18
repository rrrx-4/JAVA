/*

for num = 5 

*
*   * 
*   *   *
*   *   *   *
*   *   *   *   *

*/ 



import java.util.* ;

public class pattern1{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
    
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        
    }
}

