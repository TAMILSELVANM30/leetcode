// Last updated: 8/19/2026, 8:53:37 PM
class Solution {
    public boolean stoneGameIX(int[] stones) {
        int n=stones.length;
        int[] arr=new int[3];
        for(int i=0;i<n;i++){
            arr[stones[i]%3]++;

        }
        int cero=arr[0];
        int a1=arr[1];
        int a2=arr[2];
        if(cero%2==0){
            return a1>0&& a2>0;
        }
        return Math.abs(a1-a2)>2;
    }
}