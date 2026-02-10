# Last updated: 2/10/2026, 8:48:00 PM
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        arr = nums1 + nums2
        arr.sort()

        n = len(arr)
        l = (n // 2)

        if n % 2 == 1:
            return float(arr[l])
        else:
            l12 = arr[l - 1]       
            l21 = arr[l]            
            su = ((l12 + l21) / 2.0)
            return su
