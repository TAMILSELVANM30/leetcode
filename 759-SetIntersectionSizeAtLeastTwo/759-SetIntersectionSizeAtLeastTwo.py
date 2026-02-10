# Last updated: 2/10/2026, 8:47:48 PM
class Solution(object):
    def intersectionSizeTwo(self, intervals):
        intervals.sort(key=lambda x: (x[1], -x[0]))
        chosen = []
        for start, end in intervals:
            count = 0
            for num in chosen[-2:]:
                if start <= num <= end:
                    count += 1
            while count < 2:
                new_num = end - (1 - count)
                chosen.append(new_num)
                count += 1
        return len(chosen)