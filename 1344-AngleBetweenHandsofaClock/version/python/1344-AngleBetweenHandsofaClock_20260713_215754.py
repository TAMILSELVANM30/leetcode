# Last updated: 7/13/2026, 9:57:54 PM
1class Solution(object):
2    def angleClock(self, hour, minutes):
3        """
4        :type hour: int
5        :type minutes: int
6        :rtype: float
7        """
8        hour_angle = (hour % 12) * 30 + minutes * 0.5
9        minute_angle = minutes * 6
10        diff = abs(hour_angle - minute_angle)
11        return min(diff, 360 - diff)
12