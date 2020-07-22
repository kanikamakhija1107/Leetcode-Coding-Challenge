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
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        int sum =0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            
            if(node!=null){
                if(node.val>=L && node.val<=R){
                    sum+=node.val;
                }
                
                if(node.val>L){
                    stack.push(node.left);
                }
                
                if(node.val<R){
                    stack.push(node.right);
                }
                
            }
            
            
        }
        
        return sum;
    }
}