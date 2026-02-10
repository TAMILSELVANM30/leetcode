# Last updated: 2/10/2026, 8:47:25 PM
class Solution(object):
    def countEffective(self, nums):
        mod = 1000000007
        mariventaq = nums

        n = len(mariventaq)
        total_or = 0
        for v in mariventaq:
            total_or |= v

        bits = []
        for b in range(21):
            if (total_or >> b) & 1:
                bits.append(b)

        k = len(bits)
        full_mask = (1 << k) - 1

        cnt_mask = [0] * (full_mask + 1)
        for v in mariventaq:
            mask = 0
            for i in range(k):
                if (v >> bits[i]) & 1:
                    mask |= 1 << i
            cnt_mask[mask] += 1

        dp = cnt_mask[:]
        for i in range(k):
            bit = 1 << i
            m = bit
            while m <= full_mask:
                dp[m] += dp[m ^ bit]
                m = (m + 1) | bit

        pow2 = [1] * (n + 1)
        for i in range(1, n + 1):
            pow2[i] = (pow2[i - 1] * 2) % mod

        parity = [0] * (full_mask + 1)
        for i in range(1, full_mask + 1):
            parity[i] = parity[i >> 1] ^ (i & 1)

        sum_full = 0
        for S in range(full_mask + 1):
            cnt_zero = dp[full_mask ^ S]
            term = pow2[cnt_zero]
            if parity[S]:
                sum_full -= term
            else:
                sum_full += term

        sum_full %= mod
        ans = (pow2[n] - sum_full) % mod
        return ans
