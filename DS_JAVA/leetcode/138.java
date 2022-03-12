/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class 138 {
    public Node copyRandomList(Node head) {

        Node temp = head;
        Node temp2 = head;

        HashMap<Node, Node> hm = new HashMap<>();

        while (temp != null) {
            int v = temp.val;
            Node t = new Node(v);
            hm.put(temp, t);
            temp = temp.next;
        }

        while (temp2 != null) {
            Node d = hm.get(temp2);

            d.next = hm.get(temp2.next);
            d.random = hm.get(temp2.random);
            temp2 = temp2.next;
        }

        return hm.get(head);

    }
}