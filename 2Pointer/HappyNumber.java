class Solution {
    
    public int nextNum(int n){
        
        int sum =0;
        
        while(n>0){
            
            int a = n%10;
            n=n/10;
            sum+= a*a;        
        }      
        return sum;       
    }
    
    
    public boolean isHappy(int n) {
        
        int slowRunner = n;
        int fastRunner = nextNum(n);
        
        while(slowRunner!=fastRunner && fastRunner!=1){
            
            slowRunner = nextNum(slowRunner);
            fastRunner = nextNum(nextNum(fastRunner));
        }
        
        return fastRunner==1;
  
        
    }
}