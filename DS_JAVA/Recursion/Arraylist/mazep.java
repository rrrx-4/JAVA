import java.io.*;
import java.util.*;

public class mazep {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> a = getMazePaths(1,1,n,m);
        System.out.print(a);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr > dr || sc > dc)
        {
            ArrayList<String> brs = new ArrayList<>();
            return brs ;
        }

       else if(sr==dr&&sc==dc){
            ArrayList<String> brs = new ArrayList<>();

            brs.add("");

            return brs;
        }

        ArrayList<String> paths  = new ArrayList<>();                  


        ArrayList<String> hpaths = getMazePaths(sr,sc+1,dr,dc);     

        for(String hpath: hpaths)          
        { 
            paths.add("h"+hpath);                                   
        }

        ArrayList<String> vpaths = getMazePaths(sr+1,sc,dr,dc);     

        
        for(String vpath: vpaths)
        { 
            paths.add("v"+ vpath);                                  
        }

        
                                   return paths      ;                                        


        
    }

}