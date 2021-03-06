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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        if(root==null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            TreeNode temp = stack.pop();
            list.add(temp.val);
            
            if(temp.right!=null){
                stack.push(temp.right);
            }
            
            if(temp.left!=null){
                stack.push(temp.left);
            }         
            
        }
        return list;
    }
}