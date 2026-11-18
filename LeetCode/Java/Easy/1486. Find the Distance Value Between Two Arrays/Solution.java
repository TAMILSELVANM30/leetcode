class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for (int n:arr1){
            if(valid(n, arr2, d)) count++;
        }
        return count;
    }
    public static boolean valid(int n,int[] arr,int d){
        for(int i:arr){
            if(Math.abs(n-i)<=d) return false;
        }
        return true;
    }
}