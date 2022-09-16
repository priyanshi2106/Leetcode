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
      ListNode res = new ListNode(0);
        ListNode temp = head;
      res.next = head;
        //calculate the length
        int length = 0;
        int i = 1;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        temp = res;
        while(i <= length-n){
            temp = temp.next;
            i++;
        }
        
        temp.next = temp.next.next;
       // curr = curr.next;
        return res.next;
    }
}