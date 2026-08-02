// Last updated: 8/2/2026, 8:56:46 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        int le=nums.length;
4        long mul=0,gcd_num=0,maxi1=0,maxi2=0;
5        
6        for(int i=0;i<le;i++){
7            for(int j=i;j<le;j++){
8                 mul=(long) nums[i]*nums[j];
9                gcd_num=gcd(nums[i],nums[j])*gcd(nums[i],nums[j]);
10                maxi2=mul/gcd_num;
11                if(maxi1<maxi2){
12                    maxi1=maxi2;
13                }else{
14                    maxi1=maxi1;
15                }
16            }
17        }
18        
19        return  maxi1;
20        
21    }
22    public long gcd(int i,int j){
23        if(j==0){
24            return i;
25        }
26        return gcd(j,i%j);
27    }
28}