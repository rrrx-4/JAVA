import java.util.*;

class merge2ll {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        void addlast(int val){
            ListNode t = new ListNode(-1);
            t.next  = null;
            this.next = t;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(-1);

        while(l1!=null && l2!=null)
        {
            if(l1.val < l2.val){
            l3.addlast(l1.val);
            l1 = l1.next;
            }
            else{
         l3.addlast(l2.val);
            l2 = l2.next;
            }
        }
        if(l1==null)
        {
            while(l2!=null)
           l3.addlast(l2.val);
            l2 = l2.next;
        }
        else{
            while(l1!=null){
              l3.addlast(l1.val);
                l1 = l1.next;
            }
        }

        return l3;
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
        int m = scn.nextInt();
        ListNode h2 = createList(m);


        ListNode head = mergeTwoLists(h1, h2);
        printList(head);
    }
}

/*2
1 5 
4
1 3 6 10 

1 1 3 5 6 10 */