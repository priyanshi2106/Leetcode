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
        ListNode t = new ListNode(0);
        int length = 0;
         t.next = head;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        int i = 1;
        temp = t;
        while(i <= length-n){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return t.next;
    }
}