// Last updated: 6/25/2026, 11:33:13 PM
class Solution {
    public double angleClock(int hour, int minutes) {    
    double n;
    n=Math.abs((hour*30)-(minutes*5.5));
    double n3n=(360-n);

     return Math.min(n3n,n);

    }
}