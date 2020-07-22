class Solution {
    
    // X = Start
    // U = Up
    // D = Down
    // R = Right
    // L = Left
    // O = Out of bound/ if 0 encountered
    
    
    public int numDistinctIslands(int[][] grid) {
        
        //edge case    
        if(grid.length == 0 || grid == null)
            return 0;
        
        int n = grid.length;
        int m = grid[0].length;
        
        Set<String> set = new HashSet<>();
        
        //iterate over the grid and if 1 found, we need to compute that string and add it to the set
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                
                if(grid[i][j] == 1){ // if current position is land
                    String path = computePath(grid, i, j, n, m, "X");
                    set.add(path);
                }        
            }
        }
        return set.size();
    }
    
    private String computePath(int[][] grid, int i, int j , int n , int m, String direction){
        
        //base case
        
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] == 0){
            return "O";
        }
        
        grid[i][j] = 0;      
        String left = computePath(grid, i, j-1, n, m, "L");
        String right = computePath(grid,i, j+1, n, m, "R");
        String up = computePath(grid,i-1, j, n, m, "U" );
        String down = computePath(grid,i+1, j, n, m, "D"); 
        
        return direction + left + right + up + down;
    }
    
}