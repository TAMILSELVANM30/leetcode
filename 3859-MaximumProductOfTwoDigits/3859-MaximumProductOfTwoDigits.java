// Last updated: 8/8/2026, 9:50:32 PM
class Solution {
    public int maxProduct(int n) {
        return product(n);
        
    }
    public int product(int n){
        int le=(int)Math.log10(n)+1;
        int[] arr=new int[le];
        int i=0;
        while(n!=0){
            arr[i++]=n%10;
            n=n/10;
        }
        Arrays.sort(arr);
        return arr[le-1]*arr[le-2];

    }
}