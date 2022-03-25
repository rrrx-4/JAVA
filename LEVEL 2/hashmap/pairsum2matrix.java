package hashmap;

import java.util.*;

public class pairsum2matrix {

    public static int solve2(int[][] num1, int[][] num2, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                hm.put(num1[i][j], hm.getOrDefault(num1[i][j], 0) + 1);
            }
        }

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                int b = k - num2[i][j];

                if (hm.containsKey(b)) {
                    ans += hm.get(b);
                }
            }
        }
        return ans;

    }

    public static int solve(int[][] num1, int[][] num2, int k) {
        int b1 = 0;
        int b2 = num1[0].length * num2[0].length - 1;
        int c = num1[0].length * num2[0].length;
        int ans = 0;

        while (b1 < c && b2 >= 0) {
            int r1 = b1 / num1[0].length;
            int c1 = b1 % num1[0].length;
            int r2 = b2 / num2[0].length;
            int c2 = b2 % num2[0].length;

            int sum = num1[r1][c1] + num2[r2][c2];
            if (sum == k) {
                b1++;
                b2--;
                ans++;
            } else if (sum > k) {
                b2--;
            } else {
                b1++;
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat1 = new int[N][N];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[N][N];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();
        System.out.println(solve(mat1, mat2, K));

    }

}
