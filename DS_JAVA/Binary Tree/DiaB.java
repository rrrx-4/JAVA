import java.io.*;
import java.util.*;

public class DiaB {
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

    static int dia = 0;

    public static int diameter1(Node node) {
        // write your code here
        if (node == null)
            return -1;

        int l = diameter1(node.left);
        int r = diameter1(node.right);

        int t = l + r + 2;

        if (t > dia) {
            dia = t;
        }

        return Math.max(l, r) + 1;
    }

    public static int dia2(Node node, diamover d) {
        if (node == null) {
            return -1;
        }
        int l = dia2(node.left, d);
        int r = dia2(node.right, d);

        int t = l + r + 2;
        if (t > d.dia) {
            d.dia = t;
        }

        return Math.max(l, r) + 1;
    }

    public static class diamover {
        int dia = -1;
    }

    public static int dia3(Node node) {

        if (node == null)
            return 0;

        int lh = height(node.left);
        int rh = height(node.right);
        int t = lh + rh + 2;

        int dl = dia3(node.left);
        int dr = dia3(node.right);

        int mdia = Math.max(t, Math.max(dl, dr));
        return mdia;
    }

    public static class h {
        int d = 0;
        int h = -1;
    }

    public static h dia4(Node node, h h1) {

        if (node == null) {
            h r = new h();
            // r.d = 0;
            // r.h = -1;
            return r;
        }

        h l = dia4(node.left, h1);
        h r = dia4(node.right, h1);

        h t = new h();
        t.d = Math.max(l.h + r.h + 2, Math.max(l.d, r.d));
        t.h = Math.max(l.h, r.h) + 1;

        return t;
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

        diamover d = new diamover();

        h h1 = new h();

        h1 = dia4(root, h1);
        System.out.println(h1.d);

        // dia2(root, d);
        // System.out.println(d.dia);

        // int diameter = diameter1(root);
        // System.out.println(dia);

        // System.out.println(dia3(root));
    }

}