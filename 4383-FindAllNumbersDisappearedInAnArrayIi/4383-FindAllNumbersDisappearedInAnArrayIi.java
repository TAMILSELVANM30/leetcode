// Last updated: 8/25/2026, 8:08:28 PM
class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<int[]> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<int[]> zenokarli=taketheanswer(nums,lower, upper, list);
        for(int[] arr:zenokarli){
            ans.add(Arrays.asList(arr[0],arr[1]));
        }
       
        return ans;
    }
    public List<int[]> taketheanswer(int[]nums, int lower, int upper, List<int []> list){
      
        int tip=lower;
         int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]<tip){
                continue;
            }if(nums[i]==tip){
                tip++;
            }
           
            else{
                if(upper<nums[i]){
                break;
            }
                list.add(new int[]{tip,nums[i]-1});
                tip=nums[i]+1;
            }
           }  
         if(tip<=upper){
                list.add(new int[]{tip,upper});
         }
       
        return list;
    }
    
}