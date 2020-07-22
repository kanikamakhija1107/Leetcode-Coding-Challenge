class Solution {
    public int romanToInt(String s) {
        
        if(s==null || s.length()==0){
            return 0;
        }
        
        Map<Character,Integer> hm = new HashMap<Character, Integer>();
        
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int length= s.length();
        int result = hm.get(s.charAt(length-1));
        
        for(int i=length-2; i>=0 ; i--){
            
            if(hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1))){
                
                result+= (hm.get(s.charAt(i)));      
            }
            
            else {
                result-= (hm.get(s.charAt(i)));
            }
                                 
        }
        return result;
   
    }
}