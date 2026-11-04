// Last updated: 11/4/2026, 5:43:39 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3     int first=-1, last=-1, left=0, right=nums.length-1;
4    // if(nums.length==1 && target!=0) return new int[] {0,0};
5     while(left<=right){
6        int mid=left+((right-left)/2);
7        if(nums[mid]<target){
8            left=mid+1;
9        }if(nums[mid]>target){
10            right=mid-1;
11        }if(nums[mid]==target){
12            first=mid;
13            right=mid-1;
14        }
15     } 
16     left=0;
17    right=nums.length-1;
18        while(left<=right){
19        int mid=left+((right-left)/2);
20        if(nums[mid]<target){
21            left=mid+1;
22        }if(nums[mid]>target){
23            right=mid-1;
24        }if(nums[mid]==target){
25            last=mid;
26            left=mid+1;
27        }
28     } 
29     return new int[] {first, last};
30       
31    }
32}