# Last updated: 2/10/2026, 8:47:44 PM
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