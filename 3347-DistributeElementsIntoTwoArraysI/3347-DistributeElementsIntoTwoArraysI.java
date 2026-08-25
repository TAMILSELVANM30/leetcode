// Last updated: 8/25/2026, 8:09:07 PM
class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int [] arr2=new int [n-1];
        int a=0;
        int b=0;
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[a]>arr2[b]){
                arr1[++a]=nums[i];
            }else{
                arr2[++b]=nums[i];
            }
        }
        for(int j=0;j<b+1;j++){
                arr1[++a]=arr2[j];
            }
           
            return arr1;
    }
}