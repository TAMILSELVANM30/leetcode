// Last updated: 11/2/2026, 10:24:49 PM
class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1) return 0;
       int ans=0;
       int Q=n/2-1;
      if(n%2==0){
        int first=mini_move(n,nums);
        int second=Q_move(Q,nums,n);
        ans=Math.min(first, second);
      }else{
        ans=mini_move(n,nums);
      }
      return ans;

    }
    public static int mini_move(int n, int [] nums){
        int[] nums1=nums.clone();
        int m=nums1[n/2];
        int ans=0;
        for(int i=0;i<n;i++){
            nums1[i]=Math.abs(nums1[i]-m);
            ans+=nums1[i];
        }
        return ans;
    }
       public static int Q_move(int Q, int [] nums,int n){
        int[] nums1=nums.clone();
        int m=nums1[Q];
        int ans=0;
        for(int i=0;i<n;i++){
            nums1[i]=Math.abs(nums1[i]-m);
            ans+=nums1[i];
        }
        return ans;
    }
   
}