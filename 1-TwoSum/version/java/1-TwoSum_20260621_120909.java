// Last updated: 6/21/2026, 12:09:09 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> ha=new HashMap<>();
4        int le=nums.length;
5        for (int i=0;i<le;i++){
6        int cal=target-nums[i];
7        if(ha.containsKey(cal)){
8            
9            return new int[]{ha.get(cal),i};
10        }
11            ha.put(nums[i],i);
12        }
13        return null;
14        
15    }
16}