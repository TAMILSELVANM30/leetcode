# Last updated: 2/10/2026, 8:47:30 PM
class Solution(object):
    def numberOfSubstrings(self, s):
        import math
        s = s.strip().replace('"', '').replace("'", "")
        n = len(s)
        pos = [i for i,ch in enumerate(s) if ch == '0']
        m = len(pos)
        ans = 0
        i = 0
        while i < n:
            if s[i] == '1':
                j = i
                while j < n and s[j] == '1':
                    j += 1
                L = j - i
                ans += L * (L + 1) // 2
                i = j
            else:
                i += 1
        def count_leq_pairs(A, B, S):
            if S < 0:
                return 0
            if A > B:
                A, B = B, A
            k = A if A <= S else S
            if k < 0:
                return 0
            if S <= B:
                return (k + 1) * (S + 1) - (k * (k + 1)) // 2
            else:
                t = S - B
                end1 = t if t <= A else A
                count1 = 0
                if end1 >= 0:
                    count1 = (end1 + 1) * (B + 1)
                start2 = end1 + 1
                if start2 > k:
                    count2 = 0
                else:
                    m2 = k - start2 + 1
                    count2 = m2 * (S - start2 + 1) - (m2 * (m2 - 1)) // 2
                return count1 + count2
        max_z = int(math.sqrt(n)) + 1
        for z in range(1, max_z + 1):
            if z > m:
                break
            need = z + z * z
            for i0 in range(0, m - z + 1):
                left_zero_idx = pos[i0]
                right_zero_idx = pos[i0 + z - 1]
                prev_pos = pos[i0 - 1] if i0 - 1 >= 0 else -1
                next_pos = pos[i0 + z] if (i0 + z) < m else n
                Lopts = left_zero_idx - prev_pos
                Ropts = next_pos - right_zero_idx
                base_len = right_zero_idx - left_zero_idx + 1
                T = need - base_len
                A = Lopts - 1
                B = Ropts - 1
                total_pairs = (A + 1) * (B + 1)
                if T <= 0:
                    ans += total_pairs
                else:
                    leq = count_leq_pairs(A, B, T - 1)
                    ans += total_pairs - leq
        return ans
