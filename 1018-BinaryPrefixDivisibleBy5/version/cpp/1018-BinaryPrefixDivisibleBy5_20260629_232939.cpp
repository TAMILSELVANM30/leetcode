// Last updated: 6/29/2026, 11:29:39 PM
1class Solution {
2public:
3    vector<bool> prefixesDivBy5(vector<int>& nums) {
4        vector<bool> ans;
5        int val = 0;
6        for (int bit : nums) {
7            val = (val * 2 + bit) % 5;
8            ans.push_back(val == 0);
9        }
10        return ans;
11    }
12};