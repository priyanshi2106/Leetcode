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
        //first find the end of first half 
        ListNode firstHalfEnd = endOfFirsthalf(head);
        ListNode startOfSecHalf = reverse(firstHalfEnd.next);
        
        //check if its palindrome or not
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
        firstHalfEnd.next = reverse(startOfSecHalf);
        return res;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    public ListNode endOfFirsthalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}