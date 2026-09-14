// Last updated: 9/14/2026, 11:54:28 PM
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