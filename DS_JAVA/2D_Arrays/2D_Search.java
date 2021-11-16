import java.util.*;

public class 2D_Search{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] a = new int[n][n];

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();

        int i = 0;
        int j = a[0].length-1 ;

        while(i<a.length && j>=0){
        if(x > a[i][j])
        {
            i++;
        }
        else if(x < a[i][j])
        {
            j--;
        }
        else{
            System.out.println(i);
            System.out.println(j);
            return ;
        }
    }

        System.out.println("Not Found");


    }
}