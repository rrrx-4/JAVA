/*

for num =5

*   *   *   *   *
*   *   *   *
*   *   *
*   *
*




*/ 



import java.util.* ;

public class pattern2{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int t = num;
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=t; j++)
            {
                System.out.print("*\t");
            }
            t--;
            System.out.println();
        }
        
    }
}
