// Last updated: 8/11/2026, 3:59:35 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int le=nums.length;
4        int sum=nums[0];
5        for(int i=1;i<le;i++){
6            if(nums[i]==nums[i-1]+1){
7                    sum+=nums[i];
8            } else{
9
10                    break;
11            }     
12            }
13            int ans=sum;
14            for(int i=0;i<le;i++){
15                if(nums[i]==ans){
16                        ans+=1;
17                        i=-1;
18                    }
19
20            }
21            
22        return ans;
23        
24    }
25}