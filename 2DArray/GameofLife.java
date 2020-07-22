class Solution {
    
         // die -> live : mark -1
        // live -> die : mark 2
        
        final int[][] dirs ={{0,-1}, {0,1}, {1,0}, {-1,0}, {1,1}, {-1,1}, {1,-1}, {-1,-1}};
    public void gameOfLife(int[][] board) {
        
        if(board == null || board.length == 0)
            return;
        
        int row = board.length;
        int col = board[0].length;
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++ ){
                
                if(board[i][j]==0){
                    int lives = count(board, i , j);
                    if(lives == 3){
                        board[i][j] = -1;
                    }            
                }
                
                if(board[i][j] == 1){
                    int lives = count(board, i, j);
                    if(lives < 2 || lives > 3){
                        board[i][j]=2;
                    }
                }
            }
        }
        
    update(board);
   
    }   
   private void update(int[][] board){
        
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board[0].length; j++){
                if(board[i][j] == -1){
                    board[i][j] = 1; 
                }
                
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }
            }
        }       
    } 
    
    private int count(int[][] board, int row, int col){     
        int res = 0;
        for(int[] dir : dirs){
            int newRow = row + dir[0];
            int newCol = col + dir[1];   
         
        if(newRow >= 0 && newRow < board.length && 
           newCol >= 0 && newCol < board[0].length && 
           (board[newRow][newCol] == 1 || 
            board[newRow][newCol]==2)){            
            res++;
        }
    }  
        return res;
}       
}

