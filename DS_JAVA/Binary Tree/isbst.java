import java.io.*;
import java.util.*;

public class isbst {
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

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    // public static class pair{
    // boolean v = true;
    // int min = 0;
    // int max = 0;

    // }

    // public static pair isBST(Node node, pair p){

    // if(node==null)
    // {
    // return new pair();
    // }

    // pair l = isBST(node.left, p);
    // pair r = isBST(node.right, p);

    // pair n = new pair();

    // n.min = Math.max(node.data, l.max);
    // n.max = Math.max(node.data, r.max);

    // n.v = n.min<=node.data && n.max >= node.data && r.v==true && l.v==true;

    // return n;

    // }

    public static class pair1 {
        boolean v = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public static pair1 isBST(Node node, pair1 p) {
        if (node == null)
            return new pair1();

        pair1 l = isBST(node.left, p);
        pair1 r = isBST(node.right, p);

        pair1 n = new pair1();

        n.min = Math.min(node.data, Math.min(l.min, r.min));
        n.max = Math.max(node.data, Math.max(l.max, r.max));

        boolean b = l.max < node.data && r.min > node.data;
        n.v = b && l.v && r.v;
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

        pair1 p = new pair1();

        pair1 p1 = isBST(root, p);
        System.out.println(p1.v);

        // write your code here

    }

}