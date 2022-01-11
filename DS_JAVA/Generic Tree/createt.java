import java.util.*;

public class createt {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }

    }

    public static void levelOrder(Node root) {

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (queue.size() > 0) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");

            for (Node child : temp.children) {
                queue.add(child);
            }
        }

    }

    public static void lineWise(Node root) {
        Queue<Node> fq = new ArrayDeque<>();
        fq.add(root);
        Queue<Node> sq = new ArrayDeque<>();
        while (fq.size() > 0) {
            Node temp = fq.remove();

            for (Node child : temp.children) {
                sq.add(child);
            }
            System.out.print(temp.data + " ");
            if (fq.size() == 0) {
                System.out.println();
                fq = sq;
                sq = new ArrayDeque<>();
            }
        }
    }

    public static void zigZag(Node root) {
        Stack<Node> fs = new Stack<>();
        Stack<Node> ss = new Stack<>();
        int l = 0;
        fs.push(root);
        while (fs.size() > 0) {
            Node temp = fs.pop();
            System.out.print(temp.data + " ");
            if (l % 2 == 0) {
                for (int i = 0; i < temp.children.size(); i++) {
                    ss.push(temp.children.get(i));
                }
            } else {
                for (int i = temp.children.size() - 1; i >= 0; i--) {
                    ss.push(temp.children.get(i));
                }
            }

            if (fs.size() == 0) {
                System.out.println();
                fs = ss;
                ss = new Stack<>();
                l++;
            }
        }
    }

    public static Node construct(int[] list) {
        Stack<Node> s = new Stack<>();

        Node root = new Node(list[0]);

        s.push(root);
        Node ans = null;

        for (int i = 1; i < list.length; i++) {
            if (list[i] == -1) {

                Node t = s.pop();
                if (s.size() > 0) {
                    Node p = s.peek();
                    p.children.add(t);
                } else {
                    ans = t;
                }
            } else {
                Node temp = new Node(list[i]);
                s.push(temp);
            }
        }
        return ans;

    }

    public static void serialize(Node node, ArrayList<Integer> list) {

        list.add(node.data);

        for (Node child : node.children) {

            serialize(child, list);

        }

        list.add(-1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);

        Node ten = new Node(10);
        root.children.add(ten);

        Node twenty = new Node(20);
        root.children.add(twenty);

        Node thirty = new Node(30);
        ten.children.add(thirty);

        Node fourty = new Node(40);
        ten.children.add(fourty);

        Node fifty = new Node(50);
        fourty.children.add(fifty);

        Node sixty = new Node(60);

        Node seventy = new Node(70);

        Node eigthy = new Node(80);

        twenty.children.add(sixty);

        twenty.children.add(seventy);

        twenty.children.add(eigthy);

        levelOrder(root);

        lineWise(root);

        zigZag(root);

        int[] list = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root1 = construct(list);

        levelOrder(root1);
        ArrayList<Integer> l1 = new ArrayList<>();
        serialize(root1, l1);

        System.out.println(l1);
    }
}