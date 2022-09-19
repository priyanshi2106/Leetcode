/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null ){
            return null;
        }
        ListNode intersection = hasLoop(head);
        if(intersection == null){
            return null;
        }
        ListNode pt = head;
        ListNode pt2 = intersection;
        while(pt2 != pt){
            pt = pt.next;
            pt2 = pt2.next;
        }
        return pt;
    }
    public ListNode hasLoop(ListNode head){
       
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            i++;
            if(fast == slow){
                 
                return slow;
            }
        }
        return null;
    }
}