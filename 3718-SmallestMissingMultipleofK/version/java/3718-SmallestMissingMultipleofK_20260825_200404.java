// Last updated: 8/25/2026, 8:04:04 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet s= new HashSet<>();
4        int n=nums.length;
5        for(int i:nums){
6            s.add(i);
7        }
8       
9        int mini=1;
10      
11        while((mini%k!=0)|| (s.contains(mini))){
12                
13                mini++;
14
15        }
16        
17        
18        return mini;
19    }
20}