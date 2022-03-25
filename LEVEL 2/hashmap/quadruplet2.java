import java.util.*;

public class quadruplet2 {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                hm.put(A[i] + B[j], hm.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int s2 = (C[i] + D[j]) * -1;
                if (hm.containsKey(s2))

                {
                    ans += hm.get(s2);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        int[] arr4 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr3[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr4[i] = sc.nextInt();
        }
        System.out.println(fourSumCount(arr1, arr2, arr3, arr4));
    }

}
