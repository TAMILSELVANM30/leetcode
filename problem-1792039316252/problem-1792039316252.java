// Last updated: 10/15/2026, 10:11:56 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n=nums.size();
4        int sum=0;
5      for(int i=0;i<n;i++){
6         HashSet<Integer> set= new HashSet<>(); 
7        for(int j=i;j<n;j++){
8          set.add(nums.get(j));
9          int s=set.size();
10          sum+=s*s;
11        }
12        set.clear();
13      }
14      return sum;
15    }
16}