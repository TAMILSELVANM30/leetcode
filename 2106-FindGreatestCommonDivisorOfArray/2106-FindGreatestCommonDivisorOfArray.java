// Last updated: 8/8/2026, 9:50:58 PM
class Solution {
    public int findGCD(int[] nums) {
        int le=nums.length;
         int min=nums[0];
         int max=nums[0];
        for(int i =0;i<le;i++){
            if(nums[i]<min){
                min=nums[i];
            }if(nums[i]>max){
                max=nums[i];
            }
        }
            return gcd(min,max);
    }
public int gcd(int a, int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;

    }
}