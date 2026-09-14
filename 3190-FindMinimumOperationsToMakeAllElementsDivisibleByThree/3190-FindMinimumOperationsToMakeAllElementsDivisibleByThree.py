# Last updated: 9/14/2026, 11:54:58 PM
class Solution(object):
    def minimumOperations(self, nums):
        y=0
        see=len(nums)

        for i in range(see):
            if nums[i]%3==0:
                  y+=1
        minus=y-see
        if minus<0:
             return (minus*-1)
        else:
             return (minus)