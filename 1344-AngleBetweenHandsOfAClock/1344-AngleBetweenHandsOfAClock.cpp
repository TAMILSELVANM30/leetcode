// Last updated: 9/14/2026, 11:56:01 PM
class Solution {
public:
    double angleClock(int hour, int minutes) {
        double hourangle= (hour%12)*30 +minutes*0.5;
        double minuteangle= minutes*6;
        double diff= abs(hourangle- minuteangle);
        return min(diff, 360-diff);
    }
};