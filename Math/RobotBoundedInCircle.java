class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int j = 0, i = 0, dir = 1;
        
        for(char c : instructions.toCharArray()){
            
            if(c == 'G'){
                if(dir == 1){ // if dir: north, move fwd
                    j++;
                }
                
                else if(dir == 2){ //if dir: east, move right
                    i++;
                }
                
                else if(dir == 3){ //if dir:south, move down
                    j--;
                }
                
                else if(dir == 4){ //if dir: west, move left
                    i--;
                }
            }
            
            else if(c == 'L'){ // turn left
                
                dir = dir == 1 ? 4 : dir-1;
                
            }
            
            else if(c=='R'){ //turn right
                dir = dir == 4 ? 1 : dir + 1;
            }
            
        }
        
       return i == 0 && j == 0 || dir>1;  
    }
}

