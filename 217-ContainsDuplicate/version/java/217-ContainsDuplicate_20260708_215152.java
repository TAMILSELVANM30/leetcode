// Last updated: 7/8/2026, 9:51:52 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> s=new HashSet<Integer>();
4        for(int i:nums){
5            if(!s.contains(i)){
6                s.add(i);
7            }
8            else{
9                return true;
10            }
11            
12        }
13        return false;
14    }
15}