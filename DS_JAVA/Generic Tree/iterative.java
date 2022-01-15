import java.io.*;

import java.util.*;

public class iterative {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static class Pair {
        int state;
        Node node;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        Pair rootp = new Pair();
        Stack<Pair> s = new Stack<>();
        String pre = "";
        String post = "";

        rootp.state = -1;
        rootp.node = root;

        s.push(rootp);

        while (s.size() > 0) {
            Pair t = s.peek();

            if (t.state == -1) {
                pre += t.node.data + ", ";
                t.state++;
            } else if (t.state >= 0 && t.state < t.node.children.size()) {
                Node t1 = t.node.children.get(t.state);
                int s1 = -1;
                Pair p1 = new Pair();
                p1.node = t1;
                p1.state = s1;
                s.push(p1);
                t.state++;
            } else if (t.state == t.node.children.size()) {
                post += t.node.data + ", ";
                t.state++;
            } else {
                s.pop();
            }
        }

        System.out.println(pre);
        System.out.println(post);

    }

}