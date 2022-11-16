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

//     // Encodes a tree to a single string.
//     public String serialize(TreeNode root) {
   
//         if(root == null){
//             return null;
//         }
        
//         return root.val + ","+ serialize(root.left) +"," + serialize(root.right);
//     }

//     // Decodes your encoded data to tree.
//     public TreeNode deserialize(String data) {
//         Queue<String> q = new LinkedList<String>();
//         //Populate this queue with the string values
//         q.addAll(Arrays.asList(data.split(",")));
//         //s.split will convert string to array so we need to convert that array to           list to be able to put it into queue
        
//         return helper(q);
//     }
//     public TreeNode helper(Queue<String> q){
//         String value = q.poll();
//         if(value.equals("null")){
//             return null;
//         }
//         TreeNode newNode = new TreeNode(Integer.valueOf(value));
//         newNode.left = helper(q);
//         newNode.right = helper(q);
//         return newNode;
//     }
     public String serialize(TreeNode root) {
        if (root == null) return "#";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }
    
    private TreeNode helper(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));