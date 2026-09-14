# Last updated: 9/14/2026, 11:55:16 PM
class Solution(object):
    def findFinalValue(self, nums, original):
        while original in nums:
            original *= 2
        return original
