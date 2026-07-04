// Last updated: 7/4/2026, 8:36:18 PM
1var moveZeroes = function(nums) {
2    let left = 0;
3
4    for (let right = 0; right < nums.length; right++) {
5        if (nums[right] !== 0) {
6            [nums[right], nums[left]] = [nums[left], nums[right]];
7            left++;
8        }
9    }
10
11    return nums;    
12};