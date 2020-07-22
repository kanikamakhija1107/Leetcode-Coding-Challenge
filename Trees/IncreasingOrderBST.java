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
    public TreeNode increasingBST(TreeNode root) {
        
        if(root==null){
            return null;
        }
        
        Stack<TreeNode> stack = new Stack<>();          //create a stack
        TreeNode temp = root;                           //assign temp as root node
        TreeNode head = null;
        TreeNode current = null;
        
        while(temp!=null){                              //push elements on to the stack   
            stack.push(temp);                           //first push the root
            temp=temp.left;                             //push all its left children
        } 
        
        while(!stack.isEmpty()){
            
            TreeNode temp2 = stack.pop();              //pop left elements
            
            if(head == null){
            
                head = new TreeNode(temp2.val); //if this is the  time the element is being popped
                current = head;            
            }
            
            else{
                current.right = new TreeNode(temp2.val);
                current = current.right;
                
            }
            
            if(temp2.right!=null){
                stack.push(temp2.right);
                temp2=temp2.right;
                while(temp2.left!=null){
                stack.push(temp2.left);
                temp2=temp2.left;
            }
                
            }
                                             
        }
      
        return head;
        
    }
}