# Last updated: 9/14/2026, 11:56:15 PM
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