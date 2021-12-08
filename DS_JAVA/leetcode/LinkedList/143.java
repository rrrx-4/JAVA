// 143. Reorder List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        ListNode mid = middleNode(head);
        ListNode f = head;
        ListNode s = mid.next;
        mid.next = null;
        
        ListNode rs = reverseList(s);
        
        while(rs!=null){
            ListNode f1 = f.next;
            ListNode s1 = rs.next;
            
            f.next = rs;
            rs.next = f1;
            f = f1;
            rs = s1;
        }
        
        
    }
    
        public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode p = null;
        ListNode c = head;
        
        while(c!=null)
        {
            ListNode n = c.next ;
            
            c.next = p ;
            p = c;
            c = n;
        }
        
        return p ;
        
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
}