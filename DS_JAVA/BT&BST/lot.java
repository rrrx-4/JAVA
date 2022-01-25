import java.io.*;
import java.util.*;

public class lot {
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

    // public static void levelOrder(Node node) {
    // // write your code here\
    // LinkedList<Node> q = new LinkedList<>();

    // q.addLast(node);

    // while (q.size() > 0) {
    // int s = q.size();

    // while (s-- > 0) {
    // Node t = q.removeFirst();
    // if (t.left != null)
    // q.addLast(t.left);
    // if (t.right != null)
    // q.addLast(t.right);

    // System.out.print(t.data + " ");
    // }
    // System.out.println();
    // }
    // }

    public static void levelOrder1(Node node) {

        ArrayDeque<Node> pq = new ArrayDeque<>();
        ArrayDeque<Node> cq = new ArrayDeque<>();

        pq.add(node);

        while (pq.size() > 0) {
            Node t = pq.remove();
            System.out.print(t.data + " ");
            if (t.left != null)
                cq.add(t.left);
            if (t.right != null)
                cq.add(t.right);

            if (pq.size() == 0) {
                pq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void levelOrder2(Node node) {

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(node);

        while (q.size() > 0) {
            int c = q.size();

            while (c-- > 0) {
                Node t = q.remove();
                System.out.print(t.data + " ");
                if (t.left != null)
                    q.add(t.left);
                if (t.right != null)
                    q.add(t.right);
            }
            System.out.println();
        }
    }

    public static void levelOrder3(Node node) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(node);
        Node d = new Node(-1, null, null);
        q.add(d);

        while (q.size() > 0) {
            Node t = q.remove();

            if (t.data == -1) {
                System.out.println();
                if (q.size() > 0) {
                    q.add(new Node(-1, null, null));
                }
                continue;
            }

            System.out.print(t.data + " ");
            if (t.left != null)
                q.add(t.left);
            if (t.right != null)
                q.add(t.right);
        }
    }

    public static class lpair {
        int l;
        Node n;

        lpair(int l, Node n) {
            this.l = l;
            this.n = n;
        }

    }

    public static void levelOrder(Node node) {
        ArrayDeque<lpair> q = new ArrayDeque<>();
        int lev = 1;
        lpair p = new lpair(1, node);
        q.add(p);
        while (q.size() > 0) {
            lpair t = q.remove();

            if (t.l > lev) {
                System.out.println();
                lev = t.l;
            }

            System.out.print(t.n.data + " ");
            if (t.n.left != null) {
                lpair c = new lpair(t.l + 1, t.n.left);
                q.add(c);
            }
            if (t.n.right != null) {
                lpair c = new lpair(t.l + 1, t.n.right);
                q.add(c);
            }
        }
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
        levelOrder(root);
    }

}