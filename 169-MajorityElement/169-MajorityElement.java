// Last updated: 6/11/2026, 1:30:34 AM
class Solution {
    public int majorityElement(int[] nums) {
       int le=nums.length;
       int canditate=0;
       int count =0;
       for (int current =0;current<le;current++){
           if (count==0){
            canditate=nums[current];
           }if (canditate==nums[current]){
            count++;
           }else{
            count --;
           }
       } 
     return canditate;
    }
}