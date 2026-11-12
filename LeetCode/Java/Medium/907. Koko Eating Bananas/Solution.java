class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i:piles){
            maxi=Math.max(maxi,i);
        }
       int left=1;
       int right=maxi;
       int ans=0;
       while(left<=right){
        int mid=(left+(right-left)/2);
        long count=0;
        for(int i:piles){
            int ceiling=(i+mid-1)/mid;
            count+=ceiling;
        }
        if(count<=h){
            right=mid-1;
            ans=mid;
        }else{
            left=mid+1;
        }
       }
       return ans;
    }
}          