// Last updated: 7/7/2026, 10:25:17 PM
class MyHashMap {
    HashMap<Integer, Integer> obj=new HashMap<Integer, Integer>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
    obj.put(key,value);

    }
    
    public int get(int key) {
    
    if(obj.get(key)==null){
        return -1;
    }    
    return obj.get(key);
    
    }
    
    public void remove(int key) {
        obj.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */