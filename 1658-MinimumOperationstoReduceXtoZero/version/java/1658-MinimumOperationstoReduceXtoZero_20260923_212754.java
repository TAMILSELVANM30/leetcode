// Last updated: 9/23/2026, 9:27:54 PM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int n=nums.length;
4        int total=0;
5        int ans=Integer.MAX_VALUE;
6        for(int i=0;i<n;i++){
7            total+=nums[i];
8            ans=Math.min(ans,nums[i]);
9        }
10        int target=total-x;
11        if(total<x||ans>x) return -1;
12        return operation(nums,target,n,x);
13    }
14
15    public static int operation(int [] nums, int target,int n,int x){
16        int sum=0;
17        int left=0;
18        int len=-1;
19       
20        for(int right=0;right<n;right++){
21              sum+=nums[right];
22                
23        while(sum>target && sum!=0){
24            sum=sum-nums[left];
25            left++;
26        }
27        if(sum==target) len=Math.max(len,(right-left+1));
28        }
29        if(n-len>0 && len!=-1) return n-len;
30        return -1;
31    }
32}