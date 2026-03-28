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
        //need hashmap to avoind traversing through inoder to get th root every recursive call
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length-1,hm);
    }
    public TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map){
        //no child or no nodes left
        if(start > end){
            return null;
        }
        int root = preorder[index++];
        TreeNode rootNode = new TreeNode(root);

        int inOrderIndex = map.get(root);

        rootNode.left = helper(preorder, start, inOrderIndex-1, map);
        rootNode.right = helper(preorder, inOrderIndex+1, end, map);

        return rootNode;
    }
}