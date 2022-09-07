int longest = 0;
if(root == null){
return 0;
}
if(root!=null){
int leftHeight = 1+maxDepth(root.left);
int rightHeight = 1+ maxDepth(root.right);
if(leftHeight>rightHeight){
longest =  leftHeight;
}
else{
longest =  rightHeight;
}
}
return longest;