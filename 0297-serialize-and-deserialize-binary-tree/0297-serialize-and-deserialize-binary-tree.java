/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
   
        if(root == null){
            return "X";
        }
        
        return root.val + ","+ serialize(root.left) +"," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<String>();
        //Populate this queue with the string values
        q.addAll(Arrays.asList(data.split(",")));
        //s.split will convert string to array so we need to convert that array to           list to be able to put it into queue
        
        return helper(q);
    }
    public TreeNode helper(Queue<String> q){
        String v = q.poll();
        if(v.equals("X")){
           return null;
        }
        TreeNode newNode = new TreeNode(Integer.valueOf(v));
        newNode.left = helper(q);
        newNode.right = helper(q);
        return newNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));