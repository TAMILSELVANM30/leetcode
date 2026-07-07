// Last updated: 7/7/2026, 10:25:01 PM
int minimumOperations(int* nums, int numsSize) {
    int ops = 0;
    for (int i = 0; i < numsSize; i++) {
        int rem = nums[i] % 3;
        if (rem == 1 || rem == 2) {
            ops += 1;  
        }
    }
    return ops;
}
