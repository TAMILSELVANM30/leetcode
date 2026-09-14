# Last updated: 9/14/2026, 11:53:57 PM
class Solution(object):
    def minAllOneMultiple(self, k):
       if k%2==0 or k%5==0:
           return -1
       
       z=0
       for i in range(1,k+1):
            z=(z*10+1)%k
            if z==0:
                return i
                    
           
       return -1
                    