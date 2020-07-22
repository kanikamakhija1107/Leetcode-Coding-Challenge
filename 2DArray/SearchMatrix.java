class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0)
            return false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int left = 0, right = row*col-1;
        
        while(left<=right){
            
            int mid = left + (right-left)/2;
            int mid_val = matrix[mid/col][mid%col];
            
            if(target==mid_val){
                return true;
            }
            
            else if(target<mid_val){
                right = mid-1;
            }
            
            else if(target>mid_val){
                left = mid +1;
            }
            
        }
        
        return false;
    }
}