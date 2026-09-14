# Last updated: 9/14/2026, 11:55:52 PM
class Solution(object):
    def kLengthApart(self, nums, k):
        n1 = 0
        n = 0
        l = 0

        for i in nums:
            if i == 0:
                n += 1
            if i == 1:
                if n1 > 0 and n < k:   
                    return False
                n1 += 1
                n = 0                  

        return True
