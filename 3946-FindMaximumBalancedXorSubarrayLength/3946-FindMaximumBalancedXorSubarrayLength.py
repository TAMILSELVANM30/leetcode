# Last updated: 2/10/2026, 8:47:28 PM
class Solution(object):
    def maxBalancedSubarray(self, nums):
        norivandal = nums[:]
        prefix_xor = 0
        diff = 0
        first_seen = {(0, 0): -1}
        max_len = 0

        for i, val in enumerate(norivandal):
            prefix_xor ^= val
            if val % 2 == 0:
                diff += 1
            else:
                diff -= 1

            key = (prefix_xor, diff)
            if key in first_seen:
                max_len = max(max_len, i - first_seen[key])
            else:
                first_seen[key] = i

        return max_len
