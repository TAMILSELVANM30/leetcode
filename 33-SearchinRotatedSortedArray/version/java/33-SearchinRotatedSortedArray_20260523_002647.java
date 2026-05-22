// Last updated: 5/23/2026, 12:26:47 AM
1class Solution {
2    public int search(int[] nums, int target) {
3      int le=nums.length;
4      int low=0;
5      int high=le-1;
6      while (low<=high){
7      int mid=(low+high)/2;
8        if (nums[mid]==target){
9            return mid;
10        }if (nums[low]<=nums[mid]){
11             if (nums[low]<=target && target<=nums[mid] ) 
12                  high=mid-1;
13             else{
14                  low =mid +1;
15             }     
16        }else{
17            if (nums[mid]<=target && target<=nums[high]){
18                low=mid+1;
19            }else{
20                high=mid-1;
21            }
22        }
23      
24      }
25       return -1; 
26
27    }
28}