// Last updated: 6/11/2026, 1:30:37 AM
class Solution {
    public int search(int[] nums, int target) {
      int le=nums.length;
      int low=0;
      int high=le-1;
      while (low<=high){
      int mid=(low+high)/2;
        if (nums[mid]==target){
            return mid;
        }if (nums[low]<=nums[mid]){
             if (nums[low]<=target && target<=nums[mid] ) 
                  high=mid-1;
             else{
                  low =mid +1;
             }     
        }else{
            if (nums[mid]<=target && target<=nums[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
      
      }
       return -1; 

    }
}