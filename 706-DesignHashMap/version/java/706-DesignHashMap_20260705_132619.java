// Last updated: 7/5/2026, 1:26:19 PM
1class MyHashMap {
2    HashMap<Integer, Integer> obj=new HashMap<Integer, Integer>();
3    public MyHashMap() {
4        
5    }
6    
7    public void put(int key, int value) {
8    obj.put(key,value);
9
10    }
11    
12    public int get(int key) {
13    
14    if(obj.get(key)==null){
15        return -1;
16    }    
17    return obj.get(key);
18    
19    }
20    
21    public void remove(int key) {
22        obj.remove(key);
23    }
24}
25
26/**
27 * Your MyHashMap object will be instantiated and called as such:
28 * MyHashMap obj = new MyHashMap();
29 * obj.put(key,value);
30 * int param_2 = obj.get(key);
31 * obj.remove(key);
32 */