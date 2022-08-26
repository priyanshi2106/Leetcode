ListNode slow = head, fast = head;
while(fast != null && fast.next != null){
if(fast.next == slow){
return true;
}
slow = slow.next;
fast = fast.next.next;
}
return false;