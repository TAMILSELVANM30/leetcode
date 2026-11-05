// Last updated: 11/5/2026, 6:46:37 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int n=arr1.length, m=arr2.length;
        
         int count=0;
        for(int i=0;i<n;i++){
            int a=arr1[i]-d;
            int b=arr1[i]+d;
            boolean ans=false;
            int left=0,right=m-1;
            while(left<=right){

            int mid=left+((right-left)/2);
            int midi=arr2[mid];
            if(a<=midi && midi<=b){
                ans=true;
                break;
            }if(a>midi){
                left=mid+1;
            }if(b<midi){
                right=mid-1;
            }
            }
           
            if(!ans) count++;

        }
        return count;
    }
}