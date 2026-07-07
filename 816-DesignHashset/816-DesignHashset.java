// Last updated: 7/7/2026, 10:25:18 PM
class MyHashSet {
  
       HashSet<Integer> obj=new HashSet<Integer>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        obj.add(key);
        
    }
    
    public void remove(int key) {
        obj.remove(key);
        
    }
    
    public boolean contains(int key) {
       if(obj.contains(key)){
        return true;
       }
       return false;
        
    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */