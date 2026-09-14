// Last updated: 9/14/2026, 11:54:07 PM
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0,sum = 0,len = 1;
        while(n != 0){
            x = (n % 10) * len + x;
            if(n % 10 != 0) len = len * 10;
            sum += n % 10;
            n = n / 10;
        }
        return sum * x;
    }
}