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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode nextNode = null; //to store the reference of the next curr node
        ListNode curr = head;
        while(curr != null){
            //first save the reference of the next node
            nextNode = curr.next;
            //point the curr node tp prev
            curr.next = prev;
            // change the prev to curr node
            prev = curr;
            //point the cur Node that stores the reference of next curr to prev node
            curr = nextNode;
        }
        return prev;
    }
}