class RandomizedSet {
    
    Map<Integer, Integer> hm;
    List<Integer> list;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
        hm = new HashMap<>();
        list = new ArrayList();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        if(hm.containsKey(val)){
            return false;
        }        
        hm.put(val, list.size());
        list.add(val);
        return true;        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        
        if(!hm.containsKey(val)){
            return false;
        }
        
        int index = hm.get(val); // will give the index from hm of the element to be deleted
        int lastElement = list.get(list.size()-1);// will give the last element from AL    
        list.set(index,lastElement);//will set the value in the list kind of swap
        hm.put(lastElement,index);// update the new index of the swapped val in hm
        
        //delete the last element
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
       
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
        
        //random.nextInt(list.size()) will generate random number of the size of the array &
        //list.get will the give the value of the index value genrated from random function
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */