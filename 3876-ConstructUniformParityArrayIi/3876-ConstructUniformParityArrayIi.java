// Last updated: 9/14/2026, 11:53:40 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int le =nums1.length;
        int small=Integer.MAX_VALUE;
        for(int num:nums1){
            small=Math.min(small,num);
        }
        boolean flag=true;
        for(int i=0;i<le;i++){
            if(small==nums1[i]){
                continue; 
            }
        if(oddeven(small)==0 && oddeven(nums1[i])==0 ) flag=true;
        if(oddeven(small)==1 && oddeven(nums1[i])==0 ) flag=true;
        if(oddeven(small)==1 && oddeven(nums1[i])==1 ) flag=true;
        if(oddeven(small)==0 && oddeven(nums1[i])==1 ){
          flag=false;
          break;  
        } 
        }
        return flag==true?true:false;
    }
    public static int oddeven(int n){
         if(n%2==0){
            return 0;
         }
         return 1;
    }
}