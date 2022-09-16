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