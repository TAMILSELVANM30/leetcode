# Last updated: 2/10/2026, 8:47:41 PM
class Solution(object):
    def maxSumDivThree(self, nums):
        total = sum(nums)
        if total % 3 == 0:
            return total

        rem1 = []
        rem2 = []
        for x in nums:
            r = x % 3
            if r == 1:
                rem1.append(x)
            elif r == 2:
                rem2.append(x)

        rem1.sort()
        rem2.sort()

        ans = 0
        if total % 3 == 1:
            cand = []
            if len(rem1) >= 1:
                cand.append(total - rem1[0])
            if len(rem2) >= 2:
                cand.append(total - rem2[0] - rem2[1])
            if not cand:
                return 0
            ans = max(cand)
        else:  
            cand = []
            if len(rem2) >= 1:
                cand.append(total - rem2[0])
            if len(rem1) >= 2:
                cand.append(total - rem1[0] - rem1[1])
            if not cand:
                return 0
            ans = max(cand)

        return ans
