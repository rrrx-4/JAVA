/*
for num =5 


0
1       1
2       3       5
8       13      21      34
55      89      144     233     377

*/


import java.util.* ;

public class pattern12{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int a =0;
        int b=1;
    
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {

                System.out.print(a + "\t");
                int c =a+b;
                a = b;
                b=c;

                
            }
            
            System.out.println();
        }
        
    }
}