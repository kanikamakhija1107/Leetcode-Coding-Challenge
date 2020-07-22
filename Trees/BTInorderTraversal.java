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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        List<Integer> list = new ArrayList<Integer>();
        
        if(root==null){
            return list;
        }
        
        TreeNode temp = root;
        
        while(!stack.isEmpty() || temp!=null){
            
            if(temp!=null){
                
                stack.push(temp);
                temp=temp.left;
    
            }
            
            else{

                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
                
            }
            
            
        }
        
        
        return list;
        
    }
}