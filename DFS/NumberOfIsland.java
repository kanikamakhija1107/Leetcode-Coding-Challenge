class Solution {
    
    void dfs(char[][]grid, int r, int c){
        
        int nr = grid.length;
        int nc = grid[0].length;
        
        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c]!= '1'){
            return;
        }
        
        grid[r][c] = '2';
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
        
    }
 
    public int numIslands(char[][] grid) {
        
        if(grid==null || grid.length == 0){
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        int numIsland = 0;
  
        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                
                if(grid[i][j]=='1'){
                    numIsland++;
                    dfs(grid,i,j);
                }              
            }
        }        
        
        return numIsland;
        
    }
}