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
        //find middle
        //reverse second half
        //merge

        int middle = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode nextNode = null;
        ListNode curr = slow;
        while(curr !=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        //merge

        ListNode firstHead = head;
        ListNode secHead = prev;
        while(firstHead != null && secHead.next != null){
            //store references
            ListNode temp1 = firstHead.next;
            ListNode temp2 = secHead.next;
            firstHead.next = secHead;
            secHead.next = temp1;
            firstHead = temp1;
            secHead = temp2;
        }
    }
}