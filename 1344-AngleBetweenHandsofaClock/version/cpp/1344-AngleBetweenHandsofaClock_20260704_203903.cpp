// Last updated: 7/4/2026, 8:39:03 PM
1class Solution {
2public:
3    double angleClock(int hour, int minutes) {
4        double hourangle= (hour%12)*30 +minutes*0.5;
5        double minuteangle= minutes*6;
6        double diff= abs(hourangle- minuteangle);
7        return min(diff, 360-diff);
8    }
9};