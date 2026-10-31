// Last updated: 10/31/2026, 8:13:10 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
     int first=-1, last=-1, left=0, right=nums.length-1;
    // if(nums.length==1 && target!=0) return new int[] {0,0};
     while(left<=right){
        int mid=left+((right-left)/2);
        if(nums[mid]<target){
            left=mid+1;
        }if(nums[mid]>target){
            right=mid-1;
        }if(nums[mid]==target){
            first=mid;
            right=mid-1;
        }
     } 
     left=0;
    right=nums.length-1;
        while(left<=right){
        int mid=left+((right-left)/2);
        if(nums[mid]<target){
            left=mid+1;
        }if(nums[mid]>target){
            right=mid-1;
        }if(nums[mid]==target){
            last=mid;
            left=mid+1;
        }
     } 
     return new int[] {first, last};
       
    }
}