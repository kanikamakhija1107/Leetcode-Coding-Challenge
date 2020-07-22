class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set hs = new HashSet<>();
        //iterate through row and column
        
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9.length; j++){
                
                char number = board[i][j];
                if(number!= '.'){
                    
                    if(!hs.add(number + "in row" + i) || 
                       !hs.add(number + "in col" + j) ||
                       !hs.add(number + "in sub box" + i/3 + "-" + j/3))
                        return false;                     
                }               
                
            }
        }
        
        return true;
    }
}
