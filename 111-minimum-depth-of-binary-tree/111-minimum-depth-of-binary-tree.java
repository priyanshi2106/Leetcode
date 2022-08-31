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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int minLeft = minDepth(root.left);
       int minRight = minDepth(root.right);
        
       if(minLeft == 0 || minRight == 0){
           //Skewed tree
           return Math.max(minLeft,minRight) + 1;
    }
        return Math.min(minRight,minLeft) + 1;
    }
}