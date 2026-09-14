// Last updated: 9/14/2026, 11:53:43 PM
class Solution {
    public long countCommas(long n) {
        long count=0;

        if(n>=1000L) count+=(Math.min(n,999999L)-999L)*1;
        if(n>=1000000L) count+=(Math.min(n,999999999L)-999999L)*2;
        if(n>=1000000000L) count+=(Math.min(n,999999999999L)-999999999L)*3;
        if(n>=1000000000000L) count+=(Math.min(n,999999999999999L)-999999999999L)*4;
        if(n>=1000000000000000L) count+=(Math.min(n,99999999999999999L)-999999999999999L)*5;
        return count;
    }
}