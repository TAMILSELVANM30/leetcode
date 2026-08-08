// Last updated: 8/8/2026, 9:50:11 PM
class Solution {
    public long gcdSum(int[] nums) {
        int le=nums.length;
        long[] ans=new long[le];
        long maxi=nums[0];
        for(int i=0;i<le;i++){
            maxi=Math.max(maxi,nums[i]);
            ans[i]=gcd(maxi,nums[i]);
        }
        Arrays.sort(ans);
        long sum=0;
        int i=0, j=le-1;
        while(i<j){
            sum+=gcd(ans[i],ans[j]);
            i++;
            j--;
        }
        return sum;
    }
    public long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}