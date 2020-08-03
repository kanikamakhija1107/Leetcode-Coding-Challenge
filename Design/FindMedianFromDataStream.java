class MedianFinder {

    /** initialize your data structure here. */
    
    PriorityQueue<Integer> maxQ;
    PriorityQueue<Integer> minQ;
    
    public MedianFinder() {
        
        maxQ = new PriorityQueue<>((a,b) -> b-a);
        minQ = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        maxQ.offer(num); // add in maxQ
        minQ.offer(maxQ.poll()); // remove the num from maxQ and add it to minQ
        
        if(maxQ.size()<minQ.size()){ // if maxQ.size<minQ.size: remove num from minQ & add to maxQ
            maxQ.offer(minQ.poll());
        }
        
    }
    
    public double findMedian() {
        
        if(maxQ.size() == 0)
            return 0;
        
        if(maxQ.size()>minQ.size()){
            return maxQ.peek();
        }
        
        else 
            return (double)(maxQ.peek() + minQ.peek())/2;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */