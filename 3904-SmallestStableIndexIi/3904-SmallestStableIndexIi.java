// Last updated: 9/14/2026, 11:53:31 PM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int i=n-1;
        int[] sufixsum = new  int[n];
        int[] prefixsum=new int[n];
       int  mini=Integer.MAX_VALUE;
        while(0<=i){
           
            mini=Math.min(mini,nums[i]);
            sufixsum[i]=mini;
            i--;
        }
        i=0;
        int maxi=0;
       while(i<n){
          maxi=Math.max(maxi,nums[i]);
         prefixsum[i]=maxi;   
        i++;
       }
       for(int j=0;j<n;j++){
        if(prefixsum[j]-sufixsum[j]<=k){
            return j;
        }
       }
       return -1;
        
    }
}