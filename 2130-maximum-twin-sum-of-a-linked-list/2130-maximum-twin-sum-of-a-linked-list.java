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
    public int pairSum(ListNode head) {
        if(head.next == null){
            return head.val;
        }
        //get to the middle of LL
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //reverse the second half of ll
        ListNode start = head;
        ListNode prev = null;
        ListNode nextNode = null;
        int max = 0;
        while(slow != null){
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        while(prev != null){
            max = Math.max(max, start.val+prev.val);
            prev = prev.next;
            start = start.next;
        }
return max;
    }
}