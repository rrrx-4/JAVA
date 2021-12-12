import java.util.*;

class reverseKll {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseInKGroup(ListNode head, int k) {

        if (head==null || head.next ==null || k==1)
    	return head;

        ListNode t = head ;

        for(int i=0; i<k-1; i++)
        {
            t = t.next;
        }
        ListNode st = t.next ;
        t.next = null;

        ListNode rt = head ;
        ListNode p = null;
        while(rt!=null)
        {
            ListNode n = rt.next;
            rt.next = p;
            p = rt;
            rt = n;
        }
        ListNode ans = p;
        while(p.next!=null)
        {
            p = p.next;
        }
        p.next = st;
        return ans ;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        int k = scn.nextInt();
        h1 = reverseInKGroup(h1, k);
        printList(h1);
    }
}


