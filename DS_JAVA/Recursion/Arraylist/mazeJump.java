import java.io.*;
import java.util.*;

public class mazeJump {

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


        
    }

}