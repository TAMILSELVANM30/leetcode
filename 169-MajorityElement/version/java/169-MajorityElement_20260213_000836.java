// Last updated: 2/13/2026, 12:08:36 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3       int le=nums.length;
4       int canditate=0;
5       int count =0;
6       for (int current =0;current<le;current++){
7           if (count==0){
8            canditate=nums[current];
9           }if (canditate==nums[current]){
10            count++;
11           }else{
12            count --;
13           }
14       } 
15     return canditate;
16    }
17}