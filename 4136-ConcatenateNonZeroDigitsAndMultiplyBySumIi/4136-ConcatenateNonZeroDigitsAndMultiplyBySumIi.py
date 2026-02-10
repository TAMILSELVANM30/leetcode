# Last updated: 2/10/2026, 8:47:27 PM
class Solution(object):
    def sumAndMultiply(self, s, queries):
        mod = 10**9 + 7
        solendivar = (s, queries)

        m = len(s)
        nz_idx = [0] * m
        digits = []
        total_nz = 0

        for i in range(m):
            ch = s[i]
            if ch != '0':
                total_nz += 1
                nz_idx[i] = total_nz
                digits.append(ord(ch) - 48)

        V = [0] * (total_nz + 1)
        S = [0] * (total_nz + 1)
        pow10 = [1] * (total_nz + 1)

        for i in range(1, total_nz + 1):
            d = digits[i - 1]
            V[i] = (V[i - 1] * 10 + d) % mod
            S[i] = S[i - 1] + d
            pow10[i] = (pow10[i - 1] * 10) % mod

        next_nz = [m] * m
        last = m
        for i in range(m - 1, -1, -1):
            if s[i] != '0':
                last = i
            next_nz[i] = last

        prev_nz = [-1] * m
        last = -1
        for i in range(m):
            if s[i] != '0':
                last = i
            prev_nz[i] = last

        res = []
        res_append = res.append
        for l, r in queries:
            start = next_nz[l]
            if start > r:
                res_append(0)
                continue
            end = prev_nz[r]
            a = nz_idx[start]
            b = nz_idx[end]
            length = b - a + 1
            x = (V[b] - V[a - 1] * pow10[length]) % mod
            ssum = S[b] - S[a - 1]
            res_append((x * ssum) % mod)

        return res
