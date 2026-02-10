// Last updated: 2/10/2026, 8:47:51 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==0){
            return false;
        }
        while(n%4==0){
          n=n/4;
        }
        return n==1;
    }
}