/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode n = new ListNode(0);
        n.next=head;
        
        ListNode curr=head, prev=n;
        
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
            }
            
            else {
                prev = curr;
            }
                
            curr=curr.next;       
        }
        
        return n.next;
    }
}