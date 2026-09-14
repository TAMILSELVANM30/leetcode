# Last updated: 9/14/2026, 11:55:34 PM
class Solution(object):
    def getConcatenation(self, nums):
        dummy=[]
        for i in nums:

              dummy.append(i)
        res=dummy+nums
        return res