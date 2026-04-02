/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        // check if root is not null and add it to queue.
        // remove elements from queue based on quesue size and check the left or right
        // children of each.
      if(root == null){
        return ans;
      }
      Queue<TreeNode> q = new LinkedList<>();
      //add the root to the tree first
      q.add(root);
      while(!q.isEmpty()){
        int size = q.size();
        List<Integer> ll = new LinkedList<>();
        //go through its child node
        for(int i= 0; i < size; i++){
            TreeNode curr = q.remove();
            ll.add(curr.val);
             if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
       ans.add(ll);

      }
      return ans;
    }
}