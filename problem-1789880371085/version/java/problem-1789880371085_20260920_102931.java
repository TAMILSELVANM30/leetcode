// Last updated: 9/20/2026, 10:29:31 AM
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (x,y) -> Integer.compare(x[1],y[1]));
4        int n=intervals.length;
5        int count=0;
6        for(int i=0;i<n;i++){
7            for(int j=i+1;j<n;j++){
8                int a=intervals[i][1];
9                int b=intervals[j][0];
10                if(a>=b) count++;
11            }
12        }
13        return count;
14    }
15}