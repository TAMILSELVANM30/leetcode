// Last updated: 9/25/2026, 8:44:56 PM
class Solution {
    public int smallestIndex(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        int sum=0;
        int m=nums[i];
        while(m!=0){
            sum+=m%10;
            m=m/10;
        }
        if(i==sum){
            return i;
        }
       }
       return -1;
    }
}