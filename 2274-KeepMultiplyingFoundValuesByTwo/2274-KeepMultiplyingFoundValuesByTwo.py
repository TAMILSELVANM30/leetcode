# Last updated: 2/10/2026, 8:47:33 PM
class Solution(object):
    def findFinalValue(self, nums, original):
        while original in nums:
            original *= 2
        return original
