# Last updated: 9/14/2026, 11:56:11 PM
class Solution:
    def smallestRepunitDivByK(self, k: int) -> int:
        repunit=0
        for i in range(1,50000):
            repunit=((repunit*10)+1)%k
            if repunit==0:
                return i
                break
        else:
            return -1