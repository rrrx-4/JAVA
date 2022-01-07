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
    }
}