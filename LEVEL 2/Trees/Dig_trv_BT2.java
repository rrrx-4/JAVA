//Level order 

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import javax.management.Query;

class Dig_trv_BT2 {

    public class Pair {
        Node root;
        int l;

        Pair(Node root, int l) {
            this.root = root;
            this.l = l;
        }
    }

    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));
        int ml = 0;

        while (q.size() > 0) {
            Pair temp = q.remove();
            if (temp.l > ml)
                ml = temp.l;

            if (!hm.containsKey(temp.l)) {
                hm.put(temp.l, new ArrayList<Integer>());
                hm.get(temp.l).add(temp.root.data);
            } else {
                hm.get(temp.l).add(temp.root.data);
            }

            if (temp.root.left != null)
                q.add(new Pair(temp.root.left, temp.l + 1));
            if (temp.root.right != null)
                q.add(new Pair(temp.root.right, temp.l));
        }

        for (int i = 0; i <= ml; i++) {
            ArrayList<Integer> s = hm.get(i);
            for (int d : s) {
                ans.add(d);
            }
        }

        return ans;
    }
}