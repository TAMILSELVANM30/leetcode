// Last updated: 10/15/2026, 10:21:26 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3     int n=nums.size();
4     int sum=0;
5
6     for(int i=0;i<n;i++){
7        int count=0;
8            boolean[] ans=new boolean[101];
9        for(int j=i;j<n;j++){
10            int m=nums.get(j);
11            if(!ans[m]){
12                ans[m]=true;
13                count++;
14            }
15            sum+=count*count;
16        }
17        count=0;
18     }   
19     return sum;
20    }
21}