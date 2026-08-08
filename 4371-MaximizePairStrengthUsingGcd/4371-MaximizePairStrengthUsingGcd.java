// Last updated: 8/8/2026, 9:50:00 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        int le=nums.length;
        long mul=0,gcd_num=0,maxi1=0,maxi2=0;
        
        for(int i=0;i<le;i++){
            for(int j=i;j<le;j++){
                 mul=(long) nums[i]*nums[j];
                gcd_num=gcd(nums[i],nums[j])*gcd(nums[i],nums[j]);
                maxi2=mul/gcd_num;
                if(maxi1<maxi2){
                    maxi1=maxi2;
                }else{
                    maxi1=maxi1;
                }
            }
        }
        
        return  maxi1;
        
    }
    public long gcd(int i,int j){
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
}