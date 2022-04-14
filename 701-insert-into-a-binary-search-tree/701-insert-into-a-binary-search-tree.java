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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode tn = new TreeNode(val);
        TreeNode t = root;
        
        while(t!= null){
            
            if(val < t.val){
                if(t.left != null){
                     t = t.left;
                }
                else{
                    t.left = tn;
                   return root;
                }
            }
            
            else{
                if(t.right != null){
                     t = t.right;  
                }
                else{
                   t.right = tn;
                    return root;
                }
            }  
        }
    
                return tn;
        // if(root == null){
        //     return new TreeNode(val);
        // }
        // if(val < root.val){
        //     root.left = insertIntoBST(root.left,val);
        // }
        // else{
        //     root.right = insertIntoBST(root.right,val);
        // }
        // return root;
           
    }
}