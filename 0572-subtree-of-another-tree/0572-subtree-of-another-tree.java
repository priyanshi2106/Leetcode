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
       if(root == null || subRoot == null){
        return false;
       }
       if(isIdentical(subRoot, root)){
        return true;
       }
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isIdentical(TreeNode subRoot, TreeNode root){
          if(root == null && subRoot == null){
            return true;
        }
        if(subRoot == null || root == null){
            return false;
        }
        if(subRoot.val != root.val){
            return false;
        }
        return (isIdentical(subRoot.left, root.left) && isIdentical(subRoot.right, root.right));
    }
}