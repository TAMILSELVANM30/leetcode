# Last updated: 2/10/2026, 8:47:31 PM
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