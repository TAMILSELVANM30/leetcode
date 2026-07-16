// Last updated: 7/16/2026, 9:31:34 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int le=nums.length;
4        long[] ans=new long[le];
5        long maxi=nums[0];
6        for(int i=0;i<le;i++){
7            maxi=Math.max(maxi,nums[i]);
8            ans[i]=gcd(maxi,nums[i]);
9        }
10        Arrays.sort(ans);
11        long sum=0;
12        int i=0, j=le-1;
13        while(i<j){
14            sum+=gcd(ans[i],ans[j]);
15            i++;
16            j--;
17        }
18        return sum;
19    }
20    public long gcd(long a, long b){
21        if(b==0){
22            return a;
23        }
24        return gcd(b,a%b);
25    }
26}