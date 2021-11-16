import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // code here
        int[][] a= new int[n][n];
        
        int i = 0;
        int num = 1;   
        int tr = 0;     

        while (tr < n){
            tr++;
            
          
            for (int j = 0; j<n; j++){
                a[i][j] = num ;
                num++;
            }
         
            if (tr % 2 == 0){
                i = tr/2;
            }
       
            else {
                i = (n-1) - tr/2 ;
            }
            
        }

        // printing 2D array
        for( i = 0; i< n; i++){
            for (int j = 0; j<n; j++){  
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}











// import java.util.Scanner;

// public class Solution2 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         // code here
//         int val = 1;
//         for(int i = 1; i <= n; i++){
//             int ival = val;
//             for(int j = 1; j <= n; j++){
//                 System.out.print(ival + "\t");
//                 ival++;
//             }
//             System.out.println();
//             //update value of val for the next row
//             if(n % 2 == 0){
//                 if(i < n / 2){
//                     val += 2 * n;
//                 }else if(i == n / 2){
//                     val += n;
//                 }else{
//                     val -= 2 * n;
//                 }
//             }else{
//                 if(i <= n / 2){
//                     val += 2 * n;
//                 }else if(i == n / 2 + 1){
//                     val -= n;
//                 }else{
//                     val -= 2 * n;
//                 }
//             }
//         }
//     }
// }