import java.util.*;

public class generictree {

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
        System.out.println();
    }

    public static Node construct(int[] arr) {

        Stack<Node> stack = new Stack<Node>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                Node t1 = stack.pop();
                Node r = stack.peek();
                r.children.add(t1);
            } else {
                Node temp = new Node(arr[i]);
                stack.push(temp);
            }
        }

    }

    public static void lineWise(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        Queue<Node> cqueue = new ArrayDeque<>();
        queue.add(root);

        while (queue.size() > 0) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");

            for (Node child : temp.children) {
                cqueue.add(child);
            }
            if (queue.size() == 0) {
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println(".");
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        Node twenty = new Node(20);

        Node thirty = new Node(30);

        Node fourty = new Node(40);

        root.children.add(twenty);

        root.children.add(thirty);

        root.children.add(fourty);

        levelOrder(root);
    }
}