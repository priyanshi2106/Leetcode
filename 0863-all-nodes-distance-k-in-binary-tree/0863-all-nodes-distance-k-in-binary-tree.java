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
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //need to store child parent relationship so we consreuct a hashmap
        buildParentMap(root, null);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.add(target);
int dist =0;
        while(!q.isEmpty()){
            if (dist == k) { 
                List<Integer> result = new ArrayList<>();
                for (TreeNode node : q) {
                    result.add(node.val);
                }
                return result; 
            }
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                //go left
                if(curr.left != null && !visited.contains(curr.left)){
                    q.add(curr.left);
                    visited.add(curr.left);
                }
                //go right
                if(curr.right != null && !visited.contains(curr.right)){
                    q.add(curr.right);
                    visited.add(curr.right);
                }
                //go up
                TreeNode parent = parentMap.get(curr);
                if(parent != null && !visited.contains(parent)){
                    q.add(parent);
                    visited.add(parent);
                }
            }
            dist++;

        }
         return new ArrayList<>(); 
    }
    public void buildParentMap(TreeNode node, TreeNode parent){
        if(node == null) return;
        parentMap.put(node, parent);
        buildParentMap(node.left, node);
        buildParentMap(node.right, node);
    }
}