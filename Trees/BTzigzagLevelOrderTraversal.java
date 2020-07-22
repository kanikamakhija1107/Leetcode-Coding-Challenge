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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        boolean zigzag = false;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            List<Integer> ar = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i<size; i++){
                
                TreeNode current = q.remove();
                if(zigzag){
                    ar.add(0,current.val);
                }
                
                else{
                    ar.add(current.val);
                }
     
                if(current.left!=null){
                    q.add(current.left);
                }
                
                if(current.right!=null){
                    q.add(current.right);
                }
                
            }
            
            result.add(ar);
            zigzag = !zigzag;
            
        }
        
        return result;
    
    }
}