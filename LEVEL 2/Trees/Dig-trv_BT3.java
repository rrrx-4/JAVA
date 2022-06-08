import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Dig_trv_BT2 {

    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            Node temp = q.remove();

            while (temp != null) {
                ans.add(temp.data);
                if (temp.left != null)
                    q.add(temp.left);
                temp = temp.right;
            }
        }

        return ans;
    }
}
