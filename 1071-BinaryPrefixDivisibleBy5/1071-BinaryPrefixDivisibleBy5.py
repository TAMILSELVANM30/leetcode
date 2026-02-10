# Last updated: 2/10/2026, 8:47:43 PM
class Solution(object):
    def prefixesDivBy5(self, nums):
      string=''
      lis=[]
      for i in nums:
         string+=str(i)
         y=int(string,2)
         if y%5==0:
            lis.append(True)
         else:
            lis.append(False)
      return lis