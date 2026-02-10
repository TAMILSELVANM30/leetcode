# Last updated: 2/10/2026, 8:47:36 PM
class Solution(object):
    def getConcatenation(self, nums):
        dummy=[]
        for i in nums:

              dummy.append(i)
        res=dummy+nums
        return res