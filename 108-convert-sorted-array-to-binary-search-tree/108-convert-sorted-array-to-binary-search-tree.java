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
    public TreeNode sortedArrayToBST(int[] nums) {
      return helpers(nums, 0,nums.length-1);
        
    }
    // Time complexity : O(n)
    // Space complexity : O(log n) recursion stack
    
    public TreeNode helpers(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left+right)/2;
        if((left + right) % 2 == 1){
            mid = mid + 1;
        }
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helpers(nums, left, mid-1);
        root.right = helpers(nums, mid+1, right);
        return root;
    }
}