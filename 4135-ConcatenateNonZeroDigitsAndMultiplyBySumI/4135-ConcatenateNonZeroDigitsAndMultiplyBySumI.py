# Last updated: 2/10/2026, 8:47:21 PM
class Solution(object):
    def sumAndMultiply(self, n):
        x_str = ""

        for ch in str(n):
            if ch != '0':
                x_str += ch

        if x_str == "":
            return 0

        x = int(x_str)
        digit_sum = sum(int(c) for c in x_str)

        return x * digit_sum
