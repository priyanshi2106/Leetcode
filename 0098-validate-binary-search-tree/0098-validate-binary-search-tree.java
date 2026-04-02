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
    public boolean isValidBST(TreeNode root) {
        //we can do inorder ttraversal and store the result in a list and then go through the list and just see if it is sorted,if it is sorted then it is BST otherwise it is not.

        List<Integer> inorder = new LinkedList<>();
        helper(root, inorder);
        boolean isBST = true;
        Integer prev = inorder.get(0);
        if(inorder.isEmpty()) return true; 
        for(int i =1; i < inorder.size(); i++){
            if(prev >= inorder.get(i)){
                isBST = false;
                return isBST;
            }
            prev = inorder.get(i);
        }
        return isBST;
    }
    public void helper(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
}