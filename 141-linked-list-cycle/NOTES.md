//Time : O(n)
//Space: O(1) only using 2 nodes
public boolean hasCycle(ListNode head) {
ListNode fast = head;
ListNode slow = head;
while(fast != null && fast.next != null ){
if(fast.next == slow){
return true;
}
slow = slow.next;
fast = fast.next.next;
}
return false;