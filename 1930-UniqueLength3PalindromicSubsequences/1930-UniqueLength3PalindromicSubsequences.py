# Last updated: 9/14/2026, 11:55:31 PM
class Solution:
    def countPalindromicSubsequence(self, s):
        
        right = [0] * 26
        left = [0] * 26
        for ch in s:
            right[ord(ch) - ord('a')] += 1
        
        res = set()
        
        
        for ch in s:
            
            right[ord(ch) - ord('a')] -= 1
            
            
            for a in range(26):
                if left[a] > 0 and right[a] > 0:
                    res.add((a, ord(ch) - ord('a')))
            
            
            left[ord(ch) - ord('a')] += 1
        
        return len(res)
