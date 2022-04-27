if (root == null) return min;
getMinimumDifference(root.left);
if (prev != null) {
min = Math.min(min, root.val - prev);
}
prev = root.val;
getMinimumDifference(root.right);
return min;