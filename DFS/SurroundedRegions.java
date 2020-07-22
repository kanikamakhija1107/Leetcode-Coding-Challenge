class Solution {
    public void solve(char[][] board) {
     
         if(board.length == 0 || board == null){
            return;
        }
        
        int row = board.length;
        
        if(row==0){
            return;
        }      
        int col = board[0].length; 
        
        for(int i = 0; i<col ; i++){
            
            if(board[0][i] == 'O'){   //(00, 01,02,03) first row            
                dfs(board, 0 , i);          
            }
            
            if(board[row-1][i] == 'O'){ // last row
                dfs(board, row-1, i);
            }
        }

        for(int i = 0; i<row; i++){ //first col            
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            
            if(board[i][col-1]=='O'){ //last col
                dfs(board, i, col-1);
            }
        }
        
        for(int i = 0; i<row ; i++){
            for(int j =0; j<col; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                
                if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
     
        }
        
    }
    
    private void dfs(char[][]board, int x, int y){
        
        int r = board.length;
        int c = board[0].length;
       
        if(x<0 || y<0 || x>=r || y>=c|| board[x][y]!='O'){
           return;
       } 
        
        board[x][y]='*';
        dfs(board, x+1, y);
        dfs(board, x-1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);

    }
  
}