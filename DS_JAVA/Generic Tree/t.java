import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class t {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Queue<Node> que = new ArrayDeque<>();
        Node ten = new Node(10);
        que.add(ten);
        que.remove();
        System.out.println(que.size());
        Node tenn = new Node(100);
        que.add(tenn);
        System.out.println(que.size());

    }
}
