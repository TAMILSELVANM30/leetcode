// Last updated: 6/30/2026, 11:55:37 PM
1int minimumOperations(int* nums, int numsSize) {
2    int ops = 0;
3    for (int i = 0; i < numsSize; i++) {
4        int rem = nums[i] % 3;
5        if (rem == 1 || rem == 2) {
6            ops += 1;  
7        }
8    }
9    return ops;
10}
11