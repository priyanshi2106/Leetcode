int carry = 0;
ListNode result = new ListNode(0);
ListNode p = l1,q = l2,curr = result;
while(p != null || q != null){
int x = (p!=null)?p.val:0;
int y = (q!=null)?q.val:0;
int sum = carry+x+y;
carry = sum/10;
curr.next = new ListNode(sum%10);
curr = curr.next;
if(p!=null){
p = p.next;
}
if(q!=null){
q = q.next;
}
}
if(carry>0){
curr.next = new ListNode(carry);
}
return result.next;