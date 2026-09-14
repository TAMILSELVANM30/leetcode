// Last updated: 9/14/2026, 11:56:07 PM
class Solution {
    public double angleClock(int hour, int minutes) {    
    double n;
    n=Math.abs((hour*30)-(minutes*5.5));
    double n3n=(360-n);

     return Math.min(n3n,n);

    }
}