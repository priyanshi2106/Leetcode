/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
    public boolean isIdentical(TreeNode root1, TreeNode subRoot1){
        if(root1 == null || subRoot1 == null){
            return root1==null && subRoot1==null;
        }
        return root1.val == subRoot1.val && isIdentical(root1.left,subRoot1.left) && isIdentical(root1.right,subRoot1.right);
    }
}