// Last updated: 7/10/2026, 9:40:50 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        int le=nums.length;
4        HashMap<Integer, Integer> map1 =new HashMap<>();
5        for(int i=0;i<le;i++){
6           if(!map1.containsKey(nums[i])){
7            map1.put(nums[i],i);
8
9           }else{
10            
11            if(Math.abs(i-map1.get(nums[i]))<=k){
12                    return true;
13            }
14            else{
15                map1.put(nums[i],i);
16               
17            }
18            
19
20           }
21
22        }
23        return false;
24    }
25}