import java.io.*;

import java.util.*;

public class multisolver_ {
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
    // ******************************MULTISOLVER*******************************

    static int sum = 0;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int height = -1;

    public static void multisolver(Node node, int depth) {
        sum += node.data;
        if (max < node.data) {
            max = node.data;
        }
        if (min > node.data) {
            min = node.data;
        }

        if (height < depth) {
            height = depth;
        }

        for (Node child : node.children) {
            multisolver(child, depth + 1);
        }

    }

    public static void multisolver2(Node node, int depth, HeapMover mover) {
        mover.sum += node.data;
        if (mover.max < node.data) {
            mover.max = node.data;
        }
        if (mover.min > node.data) {
            mover.min = node.data;
        }

        if (mover.height < depth) {
            mover.height = depth;
        }

        for (Node child : node.children) {
            multisolver2(child, depth + 1, mover);
        }

    }

    public static void lar_s(Node node, second_lar sl) {
        if (sl.max < node.data) {
            sl.s_max = sl.max;
            sl.max = node.data;

        }

        for (Node child : node.children) {
            lar_s(child, sl);
        }
    }

    public static class HeapMover {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int height = -1;
    }

    public static class second_lar {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
    }

    // static int d = Integer.MAX_VALUE;
    static int f = 0;
    static int c = Integer.MAX_VALUE;

    public static class fc {
        int f = 0;
        int c = Integer.MAX_VALUE;
    }

    public static void floorCeil(Node node, int data, fc mover2) {

        if (node.data > mover2.f && node.data < data) {
            mover2.f = node.data;
        }

        if (node.data > data && node.data < mover2.c) {
            mover2.c = node.data;
        }

        for (Node child : node.children) {
            floorCeil(child, data, mover2);
        }
    }

    public static void floor(Node node, int data) {

        if (node.data > f && node.data < data) {
            f = node.data;
        }

        if (node.data > data && node.data < c) {
            c = node.data;
        }

        for (Node child : node.children) {
            floor(child, data);
        }
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

        HeapMover mover = new HeapMover();
        second_lar sl = new second_lar();

        multisolver(root, 0);
        multisolver2(root, 0, mover);

        lar_s(root, sl);

        floor(root, 40);

        fc mover2 = new fc();

        floorCeil(root, 40, mover2);

        System.out.println("floor " + mover2.f);

        System.out.println("ceil " + mover2.c);

        System.out.println("sl= " + sl.s_max);

        System.out.println("Size=" + mover.sum);
        System.out.println("Min=" + mover.min);
        System.out.println("Max=" + mover.max);
        System.out.println("Height=" + mover.height);
    }

}