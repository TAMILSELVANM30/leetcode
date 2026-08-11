// Last updated: 8/11/2026, 4:10:57 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int le =nums.length;
4        int sum=nums[0];
5        for(int i=1;i<le;i++){
6            if(nums[i]==nums[i-1]+1){
7                sum+=nums[i];
8            }else{
9                break;
10            }
11        }
12        int result=sum;
13        for(int i=0;i<le;i++){
14            if(nums[i]==result){
15                result+=1;
16                i=-1;
17            }
18        }
19        return result;
20        
21    }
22    
23}