// Last updated: 10/18/2026, 9:15:16 PM
class Solution {
    public int sumCounts(List<Integer> nums) {
     int n=nums.size();
     int sum=0;

     for(int i=0;i<n;i++){
        int count=0;
            boolean[] ans=new boolean[101];
        for(int j=i;j<n;j++){
            int m=nums.get(j);
            if(!ans[m]){
                ans[m]=true;
                count++;
            }
            sum+=count*count;
        }
        count=0;
     }   
     return sum;
    }
}