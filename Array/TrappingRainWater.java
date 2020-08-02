class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int totalVol = 0;
        
        for(int i = 0; i<n; i++){         
            int max_left = 0;
            for(int j = 0 ; j<=i-1; j++){
                max_left = Math.max(max_left,height[j]);
            }            
            int max_right = 0;
            for(int j = i+1; j<n; j++){
                max_right = Math.max(max_right, height[j]);
            }         
            int water = Math.min(max_left, max_right) - height[i];
            if(water>0){
                totalVol+=water;
            }        
            else{
                totalVol+=0;
            }
        }        
        return totalVol;        
    }
}
