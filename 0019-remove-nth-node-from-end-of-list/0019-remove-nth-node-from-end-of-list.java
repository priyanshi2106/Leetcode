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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //         If ListNode has only one element
        // If length of ListNode is equal to n, you will have to remove the first Node
        // Every other condition will be hadled by your implementation of remove node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while(first != null){
            length++;
            first = first.next;
        }
        first = dummy;
        for(int i = 0; i< length-n; i++){
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;

    }
}