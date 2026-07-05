// Last updated: 7/5/2026, 1:18:20 PM
1class MyHashSet {
2  
3       HashSet<Integer> obj=new HashSet<Integer>();
4    public MyHashSet() {
5        
6    }
7    
8    public void add(int key) {
9        obj.add(key);
10        
11    }
12    
13    public void remove(int key) {
14        obj.remove(key);
15        
16    }
17    
18    public boolean contains(int key) {
19       if(obj.contains(key)){
20        return true;
21       }
22       return false;
23        
24    }
25    
26}
27
28/**
29 * Your MyHashSet object will be instantiated and called as such:
30 * MyHashSet obj = new MyHashSet();
31 * obj.add(key);
32 * obj.remove(key);
33 * boolean param_3 = obj.contains(key);
34 */