import java.util.*;
public class Exit_point_of_martrix{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        int dir=0;
        while(true)
        {
            dir = (dir + a[i][j])%4 ;
        if(dir==0)
        {
            j++;
            if(j == a[0].length){
                j-- ;
                break;
            }
        }
        else if(dir==1)
        {
            i++;
            if(i == a.length){
                i--;
                break ;
            }
        }
        else if(dir==2)
        {
            j--;
            if(j==-1)
            {
                j++;
                break;
            }
        }
        else{
            i--;
            if(i==-1)
            {
                i++;
                break;
            }
        }
    }

    System.out.println(i);
    System.out.println(j);


    }
}