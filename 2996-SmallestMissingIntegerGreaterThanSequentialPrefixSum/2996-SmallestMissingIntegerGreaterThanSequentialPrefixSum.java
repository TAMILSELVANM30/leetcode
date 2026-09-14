// Last updated: 9/14/2026, 11:55:11 PM
class Solution {
    public int missingInteger(int[] nums) {
        int le =nums.length;
        int sum=nums[0];
        for(int i=1;i<le;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        int result=sum;
        for(int i=0;i<le;i++){
            if(nums[i]==result){
                result+=1;
                i=-1;
            }
        }
        return result;
        
    }
    
}