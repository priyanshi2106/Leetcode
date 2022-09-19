if(head == null){
return null;
}
ListNode intersect = getIntersection(head);
if(intersect == null){
return null;
}
ListNode pt = head;
ListNode pt2 = intersect;
while(pt2 != pt){
pt = pt.next;
pt2 = pt2.next;
}
return pt;
}
public ListNode getIntersection(ListNode head){
ListNode slow = head;
ListNode fast = head;
while(fast != null && fast.next != null){
fast = fast.next.next;
slow = slow.next;
if(fast == slow){
return slow;
}
}
return null;