//21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null || list2 == null ){
            return list1!=null ? list1 : list2 ;
        }
        
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        
        while(c1!=null && c2!=null){
            if(c1.val < c2.val){
                p.next = c1;
                c1 = c1.next;
                p = p.next;
            }
            else{
                   p.next = c2;
                c2 = c2.next;
                p= p.next ;
            }
        }
        
        p.next = c1!=null ? c1 : c2 ;
        
       ListNode head = dummy.next;
        dummy.next = null;
        
        return head;
        
    }
}