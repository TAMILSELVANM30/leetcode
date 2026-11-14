class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
                int size=j-i+1;
                if(size<l || size>r){
                    size=0;
                }
                if(size>=l && size<=r && sum>0){
                    
                    mini=Math.min(sum, mini);
                }
            }

        }
        return ans(mini);
    }
    public static int ans(int mini){
        if(mini==2147483647) return -1;
        return mini;
    }
}