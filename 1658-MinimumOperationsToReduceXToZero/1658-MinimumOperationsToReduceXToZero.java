// Last updated: 9/25/2026, 8:45:39 PM
class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            total+=nums[i];
            ans=Math.min(ans,nums[i]);
        }
        int target=total-x;
        if(total<x||ans>x) return -1;
        return operation(nums,target,n,x);
    }

    public static int operation(int [] nums, int target,int n,int x){
        int sum=0;
        int left=0;
        int len=-1;
       
        for(int right=0;right<n;right++){
              sum+=nums[right];
                
        while(sum>target && sum!=0){
            sum=sum-nums[left];
            left++;
        }
        if(sum==target) len=Math.max(len,(right-left+1));
        }
        if(n-len>0 && len!=-1) return n-len;
        return -1;
    }
}