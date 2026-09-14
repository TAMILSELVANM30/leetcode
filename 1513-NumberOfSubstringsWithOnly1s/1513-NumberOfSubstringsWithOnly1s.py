# Last updated: 9/14/2026, 11:55:42 PM
class Solution(object):
    def numSub(self, s):
      
      mod=10**9+7
      n1=0
      n2=0
      for i in s:
        if i=='1':
            n1+=1
            n2=(n1+n2)%mod
        else:
            n1=0
      return n2
print(Solution().numSub([]))

