import java.util.*;

class unfold {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode c = head;
        ListNode p = null;

        while(c!=null)
        {
            ListNode f = c.next;

            c.next = p;
            p = c ;
            c = f;

        }
        return p;
    }

    public static void unfold(ListNode head) {

        ListNode l1 = head;
        ListNode p1 = l1;
        ListNode l2 = head.next;
        ListNode p2 = l2;

        while(p2!=null && p2.next!=null)
        {
            ListNode f = p2.next ;

            p1.next = f;
            p2.next = f.next;
            p1= p1.next;
            p2 = p2.next;
        }

        l2 = reverse(l2);

        p1.next = l2;
       // return head;

    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}