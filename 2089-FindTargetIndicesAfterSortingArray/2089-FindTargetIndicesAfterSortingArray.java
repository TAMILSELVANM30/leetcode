// Last updated: 10/19/2026, 7:54:48 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=n-1;

        while(left<=right){
        int mid = left+((right-left)/2);
        if(nums[mid]==target){
           return  I_love(nums, mid,target);
        }
        if(nums[mid]<target){
            left=mid+1;

        }else{
            right=mid-1;
        }
    }
        return new ArrayList<>();
 }
    public static List<Integer> I_love(int[] nums, int mid,int target){
            int r=mid;
            int l=mid;
        while( r < nums.length && nums[r]==target ){  
           r=r+1;
        }
        while( l >= 0 && nums[l]==target){  
            l=l-1;
        }
       ArrayList<Integer> ans= new ArrayList<>();
        for(int i=l+1;i<r;i++){
                ans.add(i);
        }
        return ans;
    }
}