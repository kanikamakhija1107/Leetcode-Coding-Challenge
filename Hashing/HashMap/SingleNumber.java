class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i:nums){    
            hm.put(i,hm.getOrDefault(i,0)+1);   //add elements in the hashmap
        }
        
        for(int i:nums){                        //iterate through the hashmap
            if(hm.get(i)==1)
                return i;
        }
        
        return 0;
    }
}

