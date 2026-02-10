# Last updated: 2/10/2026, 8:47:50 PM
class Solution(object):
    def isOneBitCharacter(self, bits):
         i=0
         count=0
         l=len(bits)-2
         while l>=0 and bits[l]==1 :
             count+=1
             l-=1
         return count%2==0