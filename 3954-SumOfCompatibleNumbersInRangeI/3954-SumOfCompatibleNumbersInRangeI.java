// Last updated: 9/14/2026, 11:53:27 PM
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
    int count=0;
    int a=Math.max((n-k),1);
    int b=(n+k);
    for(int i=a;i<=b;i++){
        if((Math.abs(n-i)<=k)&&((n&i)==0)){
            count+=i;
        }
    }
        return count;
    }
}