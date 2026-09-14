# Last updated: 9/14/2026, 11:54:12 PM
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
