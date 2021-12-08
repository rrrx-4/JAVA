//  876. Middle of the Linked List

public class 876{
  public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head==null || head.next == null)
            return head;
        // hear while condition is stay as its ...
        while(fast!=null && fast.next!=null){
            fast = fast.next.next ;
            slow = slow.next;
        }
        return slow;
    
}

public static void main(String[] args){

}
}