
import java.util.*;

public class quadruplet1 {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target, int n) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> mal = new HashSet<>();
        // write your code here
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int l = j + 1;
                int h = nums.length - 1;

                while (l < h) {
                    int t = nums[i] + nums[j] + nums[l] + nums[h];
                    if (t == target) {
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[l]);
                        al.add(nums[h]);
                        mal.add(al);
                        l++;
                        h--;

                    } else if (t > target) {
                        h--;
                    } else {
                        l++;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        for (ArrayList<Integer> a : mal) {
            r.add(a);

        }
        return r;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
            for (ArrayList<Integer> a1 : ans) {
                for (int a : a1) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }

        }
    }
}
