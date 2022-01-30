import java.io.*;
import java.util.*;

public class mergek {

    static class Pair implements Comparable<Pair> {
        int li;
        int ai;
        int data;

        public int compareTo(Pair o) {
            return this.data - o.data;
        }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int li = 0; li < lists.size(); li++) {
            Pair t = new Pair();
            t.li = li;
            t.ai = 0;
            t.data = lists.get(li).get(0);
            pq.add(t);
        }

        // write your code here
        while (pq.size() != 0) {
            Pair t1 = pq.peek();
            pq.remove();

            rv.add(t1.data);
            t1.ai++;

            if (t1.ai < lists.get(t1.li).size()) {
                t1.data = lists.get(t1.li).get(t1.ai);
                pq.add(t1);
            }

        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}