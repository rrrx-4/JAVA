import java.util.*;

public class stairs{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

       ArrayList<String> a = getStairsPath(n);
       System.out.print(a); 
    }

    public static ArrayList<String> getStairsPath(int n){

        if(n==0)
        {
            ArrayList<String> p = new ArrayList<>();
            p.add("");
            return p ;
        }
        if(n<0)
        {
            ArrayList<String> p = new ArrayList<>();
            return  p;
        }

        ArrayList<String> paths = new ArrayList<>();        

        ArrayList<String> path1 = getStairsPath(n-1);       
        ArrayList<String> path2 = getStairsPath(n-2);       
        ArrayList<String> path3 = getStairsPath(n-3);       

        for(String path:path1)
        {
            paths.add("1"+path);                           
        }
        for(String path: path2)
        {
            paths.add("2"+path);                          
        }
        for(String path: path3)
        {
            paths.add("3"+path);                           
        }

        return paths;   }                                   
    
}