/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        ListNode curr = head;
        
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        int start = 0;
        int end =  list.size()-1;
        
        while(start<end){
            
            if(!list.get(start).equals(list.get(end))){
                return false;
            }
            start++;
            end--;
            
        }
      return true;  
    }
}