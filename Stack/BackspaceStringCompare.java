class Solution {
    public boolean backspaceCompare(String S, String T) {
         
        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(char i : charS){
            
            if(i!='#'){
                stack1.push(i);
            }
            
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
            
        }
        
        for(char i : charT){
            
            if(i!='#'){
                stack2.push(i);
            }
            
            else if(!stack2.isEmpty()){
                stack2.pop();
            }
            
        }
          return stack1.toString().equals(stack2.toString());
    }
    
  
    
    
}