import java.util.*;

class unfold {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void unfold(ListNode head) {

        ListNode t = head;
        ListNode t2 = head.next;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode l1 = t ;
        ListNode l2 = t.next;
        ListNode f = t.next.next;

        while(l1!=null || l2!=null)
        {
            l1.next = f;
            l2.next = f.next;
            f = f.next.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode p = null;

        while(t2!=null)
        {
            ListNode n = t2.next;

            t2.next = p;
            p = t2;
            t2 = n;
        }

        l1.next = p;

       // return t ;
        
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