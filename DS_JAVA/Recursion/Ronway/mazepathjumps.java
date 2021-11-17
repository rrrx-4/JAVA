import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        printMazePaths(0,0,r-1,c-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(dr==sr && dc==sc)
        {
            System.out.println(psf);
            return;
        }
        
       // horizontal
       for(int j=1; j<=dc-sc; j++){
        printMazePaths(sr,sc+j,dr,dc,psf+"h"+j);
    }

       // vertical
       for(int j=i; j<=dr-sr; j++){
        printMazePaths(sr+j,sc,dr,dc,psf+"v"+j);}

       //diagonal
       for(int j=i; j<=Math.min(dr-sr,dc-sc); j++)
       printMazePaths(sr+j,sc+j,dr,dc,psf+"d"+j);

    }

}