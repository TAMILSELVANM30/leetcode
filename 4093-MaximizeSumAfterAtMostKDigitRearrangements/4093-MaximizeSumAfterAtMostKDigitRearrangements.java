// Last updated: 10/25/2026, 11:18:02 PM
class Solution {
    public long maximizeSum(int[] nums, int k) {
      int n=nums.length;
        long ans=0;
        int[] arrange=new int[n];
        for (int i=0;i<n;i++){
            ans+=nums[i];
            arrange[i]=rearrange(nums[i])-nums[i];
        }
          Arrays.sort(arrange);
        for(int i=n-k;i<n;i++){
            ans+=arrange[i];
        }
        return ans;
        
    }
    public static int rearrange(int value){
        char[] arr=Integer.toString(value).toCharArray();
       Arrays.sort(arr);
        char[] rev=new StringBuilder(new String(arr))
            .reverse()
            .toString()
            .toCharArray();
        int val=Integer.parseInt(new String(rev));
      
        
        return val;
    }
}




 
      