// Last updated: 7/22/2026, 7:39:03 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        int le=nums.length;
4        HashMap<Integer,Integer> m=new HashMap<>();
5        for(int i=0;i<le;i++){
6            if(!m.containsKey(nums[i])){
7                m.put(nums[i],i);
8            }else{
9                if(Math.abs(i-m.get(nums[i]))<=k){
10                    return true;
11                }else{
12                    m.put(nums[i],i);
13                }
14            }
15        }
16       // System.gc();
17        return false;
18    }
19}