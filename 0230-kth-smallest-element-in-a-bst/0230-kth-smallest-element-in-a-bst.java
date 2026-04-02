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
 //[1,2,3,4,5,6]
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //T: O(n)
        //S: O(n)

        //inorder traversal is always sorted
        int ans = 0;
        List<Integer> inorder = new LinkedList<>();
        helper(root, inorder);
        for(int i = 0; i < inorder.size(); i++){
            if(i + 1 == k){
                ans = inorder.get(i);
                return ans;
            }
        }
        return ans;

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