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
     int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inorderMap.put(inorder[i],i);
        }
        return helper(preorder, inorderMap, 0, inorder.length-1);
    }
    public TreeNode helper(int[] preorder, HashMap<Integer, Integer> inorderMap, int start, int end){
        if(start > end){
            return null;
        }
        //get the root
        int root = preorder[index++];
        TreeNode rootNode = new TreeNode(root);
        int rootIndex = inorderMap.get(root);
        rootNode.left = helper(preorder, inorderMap, start, rootIndex-1);
        rootNode.right = helper(preorder, inorderMap, rootIndex+1, end);
        return rootNode;
    }
}