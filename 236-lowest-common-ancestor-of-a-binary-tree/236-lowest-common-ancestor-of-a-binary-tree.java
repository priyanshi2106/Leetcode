/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // TreeNode ans ;
    // public Solution(){
    //     this.ans = null;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null || root == p || root == q){
            return root;
        }
       TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        return left == null ? right:left;
        // recurseTree(root, p, q);
        // return ans;
    }
    // public boolean recurseTree(TreeNode curr, TreeNode p, TreeNode q){
    //     if(curr == null){
    //         return false;
    //     }
    //     //if left recursion returns true then set left as 1
    //     int left = recurseTree(curr.left,p,q)?1:0;
    //      //if right recursion returns true then set left as 1
    //     int right = recurseTree(curr.right,p,q)?1:0;
    //     int mid = (curr == p || curr == q)? 1:0;
    //     if((mid+left+right) >= 2){
    //         ans = curr;
    //     }
    //     return ((mid+left+right) > 0);
    // }
}