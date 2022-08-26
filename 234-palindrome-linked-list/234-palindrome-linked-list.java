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
    public boolean isPalindrome(ListNode head) {
       if(head == null){
           return false;
       }
        //First we take out the end of the first half of the linked list
        ListNode endOfFirstHalf = end(head);
        ListNode startOfSecHalf = reverse(endOfFirstHalf.next);
        
        //now check for palindrome
        ListNode p1 = head;
        ListNode p2 = startOfSecHalf;
        boolean res = true;
        while(res && p2 != null){
            if(p1.val != p2.val){
                res = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        endOfFirstHalf.next = reverse(startOfSecHalf);
        return res;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null; // to store the reference of the next node of curr
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode end(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}