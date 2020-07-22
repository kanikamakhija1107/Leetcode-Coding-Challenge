class Solution {
    public boolean isValid(String s) {
        
        char[] newArray = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        if(s.isEmpty()){
            return true;
        }
        
        for(int i=0;i<newArray.length;i++){
            
            if(newArray[i]=='('){
                stack.push(')');
            }
            
            else if(newArray[i]=='['){
                stack.push(']');
            }
            
            else if(newArray[i]=='{'){
                stack.push('}');
            }
            
            else if (newArray[i]==')' || newArray[i]==']' || newArray[i]=='}'){
                
                if(!stack.isEmpty()){
                    
                    char temp = stack.pop();
                    if(newArray[i]==temp){
                        continue;
                    }
                    
                    else{
                         return false;
                    } 
                            
                }
            }
            
            else 
                return false;
            
        }

        return stack.isEmpty();
    }
}