import java.io.*;
import java.util.*;

public class LBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static class pair1 {
        int size = 0;
        Node m = null;
        boolean v = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public static pair1 lbst(Node node, pair1 p) {

        if (node == null)
            return new pair1();

        pair1 l = lbst(node.left, p);
        pair1 r = lbst(node.right, p);

        pair1 n = new pair1();

        n.min = Math.min(node.data, Math.min(l.min, r.min));
        n.max = Math.max(node.data, Math.max(l.max, r.max));

        boolean isb = l.max < node.data && r.min > node.data;

        n.v = isb && l.v && r.v;

        if (n.v == true) {
            n.size = l.size + r.size + 1;
            n.m = node;
        } else {
            n.size = Math.max(l.size, r.size);
            n.m = n.size == l.size ? l.m : r.m;
        }

        return n;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        pair1 t = new pair1();
        t = lbst(root, t);

        System.out.println(t.m.data + "@" + t.size);

        // write your code here
    }

}