// Last updated: 9/14/2026, 11:53:54 PM
class Solution {
    public int scoreDifference(int[] nums) {
      boolean firstact=true;

      int le=nums.length;
      int p1=0;
      int p2=0;
        for (int i =0;i<le;i++){
        if (((i+1)%6)==0){//In every 6th game the active and inactive players swap roles
            firstact=!firstact;
            //p2+=nums[i]-nums[]
        }if (nums[i]%2!=0){//If nums[i] is odd, the active and inactive players swap roles.
            firstact=!firstact;
            
        }if(firstact){
            p1+=nums[i];
            
        }else{
            p2+=nums[i];
        }
       // return p1-p2 ;   
      }
    return p1-p2 ; 
    }
}