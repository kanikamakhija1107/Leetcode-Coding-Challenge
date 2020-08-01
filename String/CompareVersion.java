class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length, n2 = nums2.length;
        
        int i1, i2;
        
        for(int i = 0; i<Math.max(n1,n2); i++){
            if(i<n1){
                i1 = Integer.parseInt(nums1[i]);
            }
            
            else{
                i1 = 0;
            }
            
            if(i<n2){
                i2 = Integer.parseInt(nums2[i]);
            }
            
            else{
                i2 = 0;
            }
                  
            if(i1!=i2){
                if(i1>i2){
                    return 1;
                }
                
                else if(i1<i2){
                    return -1;
                }
                    
                
            }
            
        }
        
        return 0;
    }
}