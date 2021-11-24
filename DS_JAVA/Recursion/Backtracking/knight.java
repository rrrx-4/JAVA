import java.io.*;
import java.util.*;

public class knight {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess,r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // check place is visited or not and chess[r][c]!=0 works only if r n c is in array bounded... else  it will give an error...
        if(r<0 || c <0|| c>=chess.length || r>=chess.length || chess[r][c]!=0) {
            return;
        }
        if(upcomingMove==chess.length*chess.length)
        {
            // in last cell we have to put value 
         /*  0 2 13 8 19 
            12 7 18 3 14 
            1 24 15 20 9 
            6 11 22 17 4 
            23 16 5 10 21 */
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            // after successfully display array also have to make last cell is zero 
            chess[r][c] = 0;
        }

        chess[r][c] = upcomingMove;


        // total eight calls beacuase in knight have 8 possible moves
        
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);

        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}